package com.example.demo.markdowngenerator.text.emphasis;

import com.example.demo.markdowngenerator.text.Text;

public class ItalicText extends Text {

    public ItalicText(Object value) {
        super(value);
    }

    @Override
    public String getPredecessor() {
        return "_";
    }

}
