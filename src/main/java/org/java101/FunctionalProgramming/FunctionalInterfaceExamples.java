/*
Java 8 introduced functional programming features like Lambdas.

Functional programming means writing code that treats functions as first-class citizens — passing functions around just like variables.

In Java, functional programming mainly came in through:

Lambda Expressions
Functional Interfaces - A Functional Interface has only one abstract method.
Streams API
Method References
Optional Class (to avoid null)
*/
package org.java101.FunctionalProgramming;

@FunctionalInterface
interface MyOperation {
    int operate(int a, int b);
}

public class FunctionalInterfaceExamples {
    public static void main(String[] args) {
        // Using Lambda
        MyOperation addition = (a, b) -> a + b;
        MyOperation multiply = (a, b) -> a * b;

        System.out.println(addition.operate(5, 3));   // Output: 8
        System.out.println(multiply.operate(5, 3));
    }
}

/*
Built-in Functional Interfaces you should know:

Predicate<T> → returns true/false
Function<T, R> → takes input, returns output
Consumer<T> → takes input, returns nothing
Supplier<T> → returns output, no input
 */
