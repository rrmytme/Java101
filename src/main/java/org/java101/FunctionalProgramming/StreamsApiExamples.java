/*
Java 8 introduced functional programming features like Lambdas.

Functional programming means writing code that treats functions as first-class citizens — passing functions around just like variables.

In Java, functional programming mainly came in through:

Lambda Expressions
Functional Interfaces
Streams API: Streams allow you to process collections (like List, Set) in a functional style.
Method References
Optional Class (to avoid null)
*/
package org.java101.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApiExamples {
    public static void main(String[] args) {
        //Example 1:
        List<String> names = Arrays.asList("John", "Jane", "Mark", "Daisy");
        // Without streams
        for (String name : names) {
            if (name.startsWith("J")) {
                System.out.println(name);
            }
        }
        // With streams
        names.stream()
                .filter(name -> name.startsWith("J"))
                .forEach(System.out::println); // Method reference


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Example2 - Streams and filter() even numbers
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evens);  // [2, 4, 6]

        //Example3 - Streams and map() to square each number
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squares);  // [1, 4, 9, 16, 25, 36]

        //Example4: Streams and reduce() Sum of all numbers
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);  // 21

        //Example5: Streams and sorted() to sort names from Example1
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNames);

        //Example6: Streams and count() to count names from Example1
        long count = names.stream()
                .filter(name -> name.startsWith("J"))
                .count();
        System.out.println(count);  // 2
    }
}

/*
 Important Stream Operations:

Operation	Meaning	Example
filter()	Filter elements	filter(x -> x > 10)
map()	Transform elements	map(x -> x*x)
sorted()	Sort elements	sorted()
collect()	Convert stream to list/set	collect(Collectors.toList())
reduce()	Combine elements	reduce(0, (a, b) -> a + b)
 */

