package com.example.demo.markdowngenerator.text.emphasis;

import com.example.demo.markdowngenerator.text.Text;

public class InsertedText extends Text {

    public InsertedText(Object value) {
        super(value);
    }

    @Override
    public String getPredecessor() {
        return "++";
    }

}