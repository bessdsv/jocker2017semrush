package com.example.demo.markdowngenerator.text.emphasis;

import com.example.demo.markdowngenerator.text.Text;

public class StrikeThroughText extends Text {

    public StrikeThroughText(Object value) {
        super(value);
    }

    @Override
    public String getPredecessor() {
        return "~~";
    }

}
