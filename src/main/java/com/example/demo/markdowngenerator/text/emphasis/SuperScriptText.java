package com.example.demo.markdowngenerator.text.emphasis;

import com.example.demo.markdowngenerator.text.Text;

public class SuperScriptText extends Text {

    public SuperScriptText(Object value) {
        super(value);
    }

    @Override
    public String getPredecessor() {
        return "^";
    }

}