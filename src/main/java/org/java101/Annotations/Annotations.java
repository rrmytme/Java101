// Annotations provide metadata for code.

package org.java101.Annotations;

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

public class Annotations {
    public static void main(String[] args) {
        Child c = new Child();
        c.show(); // Output: Child show
    }
}

