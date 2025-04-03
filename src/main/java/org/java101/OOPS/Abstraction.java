// Abstraction hides implementation details using abstract classes or interfaces.

package org.java101.OOPS;

abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start(); // Output: Car starts with key
    }
}

