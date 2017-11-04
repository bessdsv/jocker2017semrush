package com.example.demo.markdowngenerator.list;

import com.example.demo.markdowngenerator.text.Text;

public class UnorderedListItem extends Text {

    public UnorderedListItem(Object value) {
        super(value);
    }

    @Override
    public String getPredecessor() {
        return "- ";
    }

    @Override
    public String getSuccessor() {
        return "";
    }

}
