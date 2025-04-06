/*
Java 8 introduced functional programming features like Lambdas.

Functional programming means writing code that treats functions as first-class citizens — passing functions around just like variables.

In Java, functional programming mainly came in through:

Lambda Expressions: A lambda expression is an anonymous function (no name, no modifier) that you can pass around.
Functional Interfaces
Streams API
Method References
Optional Class (to avoid null)
*/
package org.java101.FunctionalProgramming;

import java.util.*;

public class LambdaExpressions {
    public static void main(String[] args) {
        // (Lambda Expressions example
        // syntax: parameters) -> { body }
        List<String> list = Arrays.asList("Java", "Python", "C++");
        list.forEach(lang -> System.out.println(lang)); // Lambda Expression

        // () -> expression means no arguments, just run the expression.
        Runnable r2 = () -> System.out.println("Hello World with Lambda!");
        new Thread(r2).start();
    }
}

