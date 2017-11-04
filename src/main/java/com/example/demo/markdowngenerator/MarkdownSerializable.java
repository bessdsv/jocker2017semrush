package com.example.demo.markdowngenerator;

public interface MarkdownSerializable {

    MarkdownElement toMarkdownElement() throws MarkdownSerializationException;

}
