// Polymorphism allows one interface with multiple implementations.

package org.java101.OOPS;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Shape s = new Circle(); // Polymorphism
        s.draw(); // Output: Drawing a circle
    }
}
