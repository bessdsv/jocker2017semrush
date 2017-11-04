package com.example.demo.markdowngenerator.rule;

import com.example.demo.markdowngenerator.MarkdownElement;
import com.example.demo.markdowngenerator.MarkdownSerializationException;
import com.example.demo.markdowngenerator.util.StringUtil;

public class HorizontalRule extends MarkdownElement {

    public static final char HYPHEN = '-';
    public static final char ASTERISK = '*';
    public static final char UNDERSCORE = '_';

    public static final int MINIMUM_LENGTH = 3;

    private int length;
    private char character = HYPHEN;

    public HorizontalRule() {
        this.length = MINIMUM_LENGTH;
    }

    public HorizontalRule(int length) {
        this.length = Math.max(MINIMUM_LENGTH, length);
    }

    public HorizontalRule(int length, char character) {
        this(length);
        this.character = character;
    }

    @Override
    public String serialize() throws MarkdownSerializationException {
        return StringUtil.fillUpLeftAligned("", "" + character, length);
    }

}
