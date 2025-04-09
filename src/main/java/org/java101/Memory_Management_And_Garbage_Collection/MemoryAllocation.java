package org.java101.Memory_Management_And_Garbage_Collection;

public class MemoryAllocation {
    public static void main(String args){
        // 1. Stack memory - easy and fast access
        // byte, short, int, long, float, double, char, boolean
        //primitives store here
        // Primitives do not have methods — they are just values.
        int m = 10;
        /*
        m is directly stored on the stack if it's a local variable (inside a method).
        It holds the actual value (10) — no extra object wrapping.
        Memory-efficient because no object overhead.
        Fast access because primitives are stored directly.
         */

        /*
         2. Heap memory is used for storing:
            All objects
            All arrays
            Instance variables inside objects

            Java automatically manages heap memory using Garbage Collector (GC):
            If an object is no longer referenced, GC cleans it up to free memory.
         */
        MemoryAllocation emp = new MemoryAllocation();
        // emp reference is stored on the stack.
        // The actual object data is stored on the heap memory.

        // 3. String pool within heap memory
        // Strings are handled very specially in Java.
        String str1 = "hello";
        String str2 = "hello";
        /*
        here Java does not create two separate objects. Instead.
        Java stores "hello" inside a String Pool (inside Heap Memory).
        Both str1 and str2 point to the same object in the String Pool.
        String Pool makes string reuse efficient and saves memory.
         */

        // 4. Cache memory
        // Wrapper classes like Integer, Double, Boolean, Character, etc.
        // wrap primitive values into objects.
        // Small integers between -128 to +127 are interned (reused).
        Integer i = 10;   // Autoboxing
        int j = i;        // Unboxing

        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b); // true, because same cached object

        Integer x = 200;
        Integer y = 200;
        System.out.println(x == y); // false, because new objects
        // Autoboxing and unboxing are automatic but can cause performance hits if overused in loops.

        /*
        Summary:
        Memory Area     Stores
        Stack Memory	Method local variables, references to objects
        Heap Memory	    Objects, instance variables, arrays
        Method Area	    Class metadata, static variables
        String Pool	    Reused string literals

        Stack = Fast, small, short-lived
        Heap = Large, slower, managed by Garbage Collector
        String Pool = Optimized inside Heap for string
         */
        int num = 5;              // Stored on Stack
        String s1 = "Hello";      // Reused from String Pool
        String s2 = new String("Hello"); // New String object on Heap
        MemoryAllocation emp1 = new MemoryAllocation();  //  Reference on Stack, Object on Heap
    }
}
