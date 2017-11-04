package com.example.demo.markdowngenerator.text.quote;

import com.example.demo.markdowngenerator.MarkdownSerializationException;
import com.example.demo.markdowngenerator.text.Text;

public class Quote extends Text {

    public Quote(Object value) {
        super(value);
    }

    @Override
    public String serialize() throws MarkdownSerializationException {
        if (value == null) {
            throw new MarkdownSerializationException("Value is null");
        }
        StringBuilder sb = new StringBuilder();
        String lines[] = value.toString().split("\\r?\\n");
        for (int lineIndex = 0; lineIndex < lines.length; lineIndex++) {
            sb.append("> ").append(lines[lineIndex]);
            if (lineIndex < lines.length - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

}
