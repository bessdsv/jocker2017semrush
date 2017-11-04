package com.example.demo.markdowngenerator.text.emphasis;

import com.example.demo.markdowngenerator.text.Text;

public class MarkedText extends Text {

    public MarkedText(Object value) {
        super(value);
    }

    @Override
    public String getPredecessor() {
        return "==";
    }

}