package org.java101.Interfaces;

//Summary Table:
//Type	Description	Example/Use Case
//Normal	Abstract methods only	Animal, Shape
//Functional	One abstract method (lambda support)	Runnable, Comparator
//Marker	No methods, metadata marker	Serializable, Cloneable
//Nested	Defined inside another class/interface	Outer.InnerInterface
//Private	Reusable private helper methods (Java 9+)	private void helper()
//Static	Utility-like methods	MathUtil.square()
//Default	Provides method implementation (Java 8+)	default void start()
public interface InterfaceDemo {
//    1. Normal	Abstract methods only	Animal, Shape
//    A basic interface with abstract methods (no implementations).
    interface Animal {
        void makeSound(); // abstract method
    }

    class Dog implements Animal {
        public void makeSound() {
            System.out.println("Bark");
        }
    }

//2. Functional	One abstract method (lambda support)	Runnable, Comparator
//    An interface with exactly one abstract method. Can be used with lambda expressions.
//    Note: Runnable, Callable, and Comparator are functional interfaces.
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

    public class Test {
        public static void main(String[] args) {
            Greeting g = (name) -> System.out.println("Hello " + name);
            g.sayHello("Raj");
        }
    }

//3. Marker	No methods, metadata marker	Serializable, Cloneable
//    An interface with no methods. It's used to mark or signal a class to the JVM or framework.
//Used in: Serialization, Cloning, etc. Other examples: Cloneable, Remote.
    interface Serializable {} // Marker interface

    class Student implements Serializable {
        int id;
        String name;
    }

}
