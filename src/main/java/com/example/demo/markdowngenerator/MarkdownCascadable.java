package com.example.demo.markdowngenerator;

public interface MarkdownCascadable {

    /**
     * @return the string that should be added before the value
     */
    String getPredecessor();

    /**
     * @return the string that should be added after the value
     */
    String getSuccessor();

}
