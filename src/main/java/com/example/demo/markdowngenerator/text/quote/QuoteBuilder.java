package com.example.demo.markdowngenerator.text.quote;

import com.example.demo.markdowngenerator.MarkdownBuilder;

public class QuoteBuilder extends MarkdownBuilder<QuoteBuilder, Quote> {

    public QuoteBuilder() {
        super();
    }

    public QuoteBuilder(MarkdownBuilder parentBuilder) {
        super(parentBuilder);
    }

    @Override
    protected QuoteBuilder getBuilder() {
        return this;
    }

    @Override
    protected Quote createMarkdownElement() {
        return new Quote("");
    }

    @Override
    public QuoteBuilder append(Object value) {
        markdownElement.setValue(new StringBuilder()
                .append(markdownElement.getValue())
                .append(value)
                .toString());
        return this;
    }

}
