/*
Java 8 introduced functional programming features like Lambdas.

Functional programming means writing code that treats functions as first-class citizens — passing functions around just like variables.

In Java, functional programming mainly came in through:

Lambda Expressions
Functional Interfaces
Streams API
Method References
Optional Class (to avoid null) - Avoids NullPointerException by handling null safely.
*/
package org.java101.FunctionalProgramming;

import java.util.Optional;

public class OptionalClassExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);
        System.out.println(name.orElse("Default Name"));  // Output: Default Name
    }
}

