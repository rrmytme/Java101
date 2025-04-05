/*
Annotations are metadata (data about data).
They don’t directly affect the program's logic but provide information to the compiler, runtime, or tools.

Built-in Annotations in Java:
Annotation	            Purpose
@Override	            Checks if you are really overriding a method
@Deprecated	            Marks a method/class as deprecated (not recommended)
@SuppressWarnings	    Suppresses compiler warnings
@FunctionalInterface	Marks an interface as a functional interface (only 1 method)
@SafeVarargs	        Suppresses unsafe operations warning for varargs
 */
package org.java101.Annotations;

import java.util.ArrayList;

class Parent {
    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child show");
    }
}

class OldCode {
    @Deprecated
    void oldMethod() {
        System.out.println("This method is deprecated.");
    }
}

@FunctionalInterface
interface MyFunction {
    void doSomething();  // Only 1 abstract method
}

class SafeVarargsExample {
    @SafeVarargs
    private static <T> void printList(T... elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }
}

public class Annotations {
    @SuppressWarnings("unchecked")  // Suppresses unchecked cast warning
    public static void main(String[] args) {
        // @Override example
        Child c = new Child();
        c.show(); // Output: Child show

        // @Deprecated example
        OldCode obj = new OldCode();
        obj.oldMethod();  // Warning: oldMethod() is deprecated

        // @SuppressWarnings example
        // Without @SuppressWarnings, you’ll get a compiler warning about unchecked operations.
        ArrayList list = new ArrayList();  // Raw type
        list.add("Hello");
        list.add(123);
        System.out.println(list);

        // @FunctionalInterface example
        MyFunction f = () -> System.out.println("Doing something...");
        f.doSomething();

        // @SafeVarargs
        // printList("Java", "Python", "C++");
    }
}

/*
Built-in                Annotation	Purpose
@Override	            Verify method overriding
@Deprecated	            Mark method/class deprecated
@SuppressWarnings	    Hide compiler warnings
@FunctionalInterface	Mark an interface for Lambdas
@SafeVarargs	        Suppress varargs warnings
 */