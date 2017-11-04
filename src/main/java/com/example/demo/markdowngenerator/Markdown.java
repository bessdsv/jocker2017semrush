package com.example.demo.markdowngenerator;

import com.example.demo.markdowngenerator.image.Image;
import com.example.demo.markdowngenerator.link.Link;
import com.example.demo.markdowngenerator.list.TaskList;
import com.example.demo.markdowngenerator.list.TaskListItem;
import com.example.demo.markdowngenerator.list.UnorderedList;
import com.example.demo.markdowngenerator.progress.ProgressBar;
import com.example.demo.markdowngenerator.rule.HorizontalRule;
import com.example.demo.markdowngenerator.text.Text;
import com.example.demo.markdowngenerator.text.code.Code;
import com.example.demo.markdowngenerator.text.code.CodeBlock;
import com.example.demo.markdowngenerator.text.emphasis.BoldText;
import com.example.demo.markdowngenerator.text.emphasis.ItalicText;
import com.example.demo.markdowngenerator.text.emphasis.StrikeThroughText;
import com.example.demo.markdowngenerator.text.heading.Heading;
import com.example.demo.markdowngenerator.text.quote.Quote;

import java.util.Arrays;

public abstract class Markdown {

    // Heading

    public static Heading heading(String value, int level) {
        return new Heading(value, level);
    }

    public static Heading heading(String value) {
        return heading(value, 1);
    }

    public static Heading subHeading(String value) {
        return heading(value, 2);
    }

    // Rule

    public static HorizontalRule rule() {
        return new HorizontalRule();
    }

    public static HorizontalRule rule(int length) {
        return new HorizontalRule(length);
    }

    // Emphasis

    public static Text text(String value) {
        return new Text(value);
    }

    public static BoldText bold(String value) {
        return new BoldText(value);
    }

    public static ItalicText italic(String value) {
        return new ItalicText(value);
    }

    public static StrikeThroughText strikeThrough(String value) {
        return new StrikeThroughText(value);
    }

    // Link

    public static Link link(String text, String url) {
        return new Link(text, url);
    }

    public static Link link(String url) {
        return new Link(url);
    }

    // Image

    public static Image image(String text, String url) {
        return new Image(text, url);
    }

    public static Image image(String url) {
        return new Image(url);
    }

    // Progress

    public static ProgressBar progress(double progress) {
        return new ProgressBar(progress);
    }

    public static ProgressBar progressWithLabel(double progress) {
        ProgressBar progressBar = new ProgressBar(progress);
        progressBar.setAppendPercentage(true);
        return progressBar;
    }

    // Quote

    public static Quote quote(String value) {
        return new Quote(value);
    }

    // Code

    public static Code code(String value) {
        return new Code(value);
    }

    public static CodeBlock codeBlock(String value, String language) {
        return new CodeBlock(value, language);
    }

    public static CodeBlock codeBlock(String language) {
        return codeBlock(null, language);
    }

    // List

    public static UnorderedList unorderedList(Object... items) {
        return new UnorderedList(Arrays.asList(items));
    }

    public static TaskList taskList(TaskListItem... items) {
        return new TaskList(Arrays.asList(items));
    }

    public static TaskListItem task(String value) {
        return new TaskListItem(value);
    }

    public static TaskListItem task(String value, boolean checked) {
        return new TaskListItem(value, checked);
    }

}
