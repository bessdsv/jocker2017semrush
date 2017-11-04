package com.example.demo.markdowngenerator.text.code;

import com.example.demo.markdowngenerator.text.Text;

public class Code extends Text {

    public Code(Object value) {
        super(value);
    }

    @Override
    public String getPredecessor() {
        return "`";
    }

}
