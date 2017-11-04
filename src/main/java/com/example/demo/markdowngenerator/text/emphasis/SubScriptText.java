package com.example.demo.markdowngenerator.text.emphasis;

import com.example.demo.markdowngenerator.text.Text;

public class SubScriptText extends Text {

    public SubScriptText(Object value) {
        super(value);
    }

    @Override
    public String getPredecessor() {
        return "~";
    }

}