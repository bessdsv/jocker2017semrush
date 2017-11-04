package com.example.demo;

import lombok.extern.log4j.Log4j;
import com.example.demo.markdowngenerator.link.Link;
import com.example.demo.markdowngenerator.text.heading.Heading;
import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Log4j
@SpringBootApplication
public class DemoApplication {

	private final String encoding = "UTF-8";

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
			String out = args[1].split("=")[1];
			if (out != null && !out.isEmpty()) {
				File outFolder = new File(out);
				if (outFolder.exists() && outFolder.isDirectory()) {
					String files = args[0].split("=")[1];
					if (files != null && !files.isEmpty()) {
						List<String> links = FileUtils.readLines(new File(files), encoding);
						boolean needLinks = new Boolean(args[2].split("=")[1]);
						boolean needHeaders = new Boolean(args[3].split("=")[1]);
						int i = 1;
						for (String link : links) {
							StringBuilder sb = new StringBuilder();
							Document doc = Jsoup.connect(link).get();
							if (needHeaders) {
								Elements allHeaders = new Elements();
								IntStream.range(1, 10).forEach(j ->
									doc.select("h" + j).forEach(element ->
										sb.append(new Heading(element.text(), j)).append("\n")
									)
								);
							}
							if (needLinks) {
								doc.select("a[href]").forEach(item->sb.append(new Link(item.attr("href"))).append("\n"));
							}
							doc.select("body p").forEach(item-> sb.append(item.text()).append("\n"));
							doc.select("body div").forEach(item-> sb.append(item.text()).append("\n"));
							File file = new File(out + "/" + i + ".md");
							FileUtils.writeStringToFile(file, sb.toString(), encoding);
						}
					}
				}
			}
		};
	}

}
