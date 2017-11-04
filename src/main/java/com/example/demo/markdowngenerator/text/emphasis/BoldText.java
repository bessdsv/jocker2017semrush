package com.example.demo.markdowngenerator.text.emphasis;

import com.example.demo.markdowngenerator.text.Text;

public class BoldText extends Text {

    public BoldText(Object value) {
        super(value);
    }

    @Override
    public String getPredecessor() {
        return "**";
    }

}
