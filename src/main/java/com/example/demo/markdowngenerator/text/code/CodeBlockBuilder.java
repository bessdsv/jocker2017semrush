package com.example.demo.markdowngenerator.text.code;

import com.example.demo.markdowngenerator.MarkdownBuilder;

public class CodeBlockBuilder extends MarkdownBuilder<CodeBlockBuilder, CodeBlock> {

    public CodeBlockBuilder() {
        this(CodeBlock.LANGUAGE_UNKNOWN);
    }

    public CodeBlockBuilder(String language) {
        super();
        markdownElement.setLanguage(language);
    }

    public CodeBlockBuilder(MarkdownBuilder parentBuilder) {
        this(parentBuilder, CodeBlock.LANGUAGE_UNKNOWN);
    }

    public CodeBlockBuilder(MarkdownBuilder parentBuilder, String language) {
        super(parentBuilder);
        markdownElement.setLanguage(language);
    }


    @Override
    protected CodeBlockBuilder getBuilder() {
        return this;
    }

    @Override
    protected CodeBlock createMarkdownElement() {
        return new CodeBlock(CodeBlock.LANGUAGE_UNKNOWN);
    }

    @Override
    public CodeBlockBuilder append(Object value) {
        markdownElement.setValue(new StringBuilder()
                .append(markdownElement.getValue())
                .append(value)
                .toString());
        return this;
    }

}
