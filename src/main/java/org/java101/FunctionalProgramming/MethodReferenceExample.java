/*
Java 8 introduced functional programming features like Lambdas.

Functional programming means writing code that treats functions as first-class citizens — passing functions around just like variables.

In Java, functional programming mainly came in through:

Lambda Expressions
Functional Interfaces
Streams API
Method References - Shorthand for lambda when you just call a method.
Optional Class (to avoid null)
*/
package org.java101.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Mark", "Daisy");
        // Lambda
        names.forEach(name -> System.out.println(name));

        // Method Reference
        names.forEach(System.out::println);
    }
}

