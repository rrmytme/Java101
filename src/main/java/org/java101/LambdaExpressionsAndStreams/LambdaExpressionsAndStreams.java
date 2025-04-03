// Java 8 introduced functional programming features like Lambdas.

package org.java101.LambdaExpressionsAndStreams;

import java.util.*;

public class LambdaExpressionsAndStreams {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C++");

        list.forEach(lang -> System.out.println(lang)); // Lambda Expression
    }
}

