package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beautify(String input, PoemDecorator poemDecorator) {
        return poemDecorator.decorate(input);
    }

}
