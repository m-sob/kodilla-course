package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subAtFromB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String result = poemBeautifier.beautify("Przykładowy tekst", (argument) -> argument.toUpperCase());
        //String result = poemBeautifier.beautify("Przykładowy tekst", String::toUpperCase);

        System.out.println(result);

        result = poemBeautifier.beautify("Przykładowy tekst", (argument) -> argument + " będzie dłuższy");
        System.out.println(result);

        result = poemBeautifier.beautify("Przykładowy tekst", String::toLowerCase);
        System.out.println(result);

        result = poemBeautifier.beautify("Przykładowy tekst", (argument) -> argument.replace("y", "e"));
        System.out.println(result);

        result = poemBeautifier.beautify("Przykładowy  tekst", (argument) -> argument.replace("  ", " "));
        System.out.println(result);

        result = poemBeautifier.beautify("TeKsT Z wielkimi ąćęłńóżź nie wyświetla się się poprawnie :)", String::toUpperCase);
        System.out.println(result);
    }

}
