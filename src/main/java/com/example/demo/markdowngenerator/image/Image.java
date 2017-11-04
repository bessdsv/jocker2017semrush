package com.example.demo.markdowngenerator.image;

import com.example.demo.markdowngenerator.MarkdownSerializationException;
import com.example.demo.markdowngenerator.link.Link;

public class Image extends Link {

    public Image(Object text, String url) {
        super(text, url);
    }

    public Image(String url) {
        this(url, url);
    }

    @Override
    public String serialize() throws MarkdownSerializationException {
        return "!" + super.serialize();
    }

}
