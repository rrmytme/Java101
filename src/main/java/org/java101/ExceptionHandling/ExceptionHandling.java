// Java provides try-catch-finally to handle errors gracefully.

package org.java101.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExceptionHandling {

    public static void main(String[] args) {
        ExceptionHandling eh = new ExceptionHandling();
        eh.arithmeticException();
        eh.nullPointerException();
        eh.arrayIndexOutOfBoundsException();
        eh.stringIndexOutOfBoundsException();
        eh.fileNotFoundException();
        eh.ioException();
        eh.numberFormatException();
        eh.classNotFoundException();
        eh.sqlException();
        eh.multipleCatchExample();

        // thread interuptedException call
        Thread t = new Thread(() -> {
            eh.interruptedException();
        });
        t.start();
        t.interrupt(); // Interrupt the thread

        // throwAndThrows call
        try {
            eh.throwAndThrows(16);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    //     Occurs when performing an illegal arithmetic operation, such as division by zero.
    public void arithmeticException(){
        try {
            int a = 10 / 0; // Throws an exception
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("Finally block always executes");
        }
    }

    // Occurs when trying to access an object reference that is null.
    public void nullPointerException(){
        try {
            String str = null;
            System.out.println(str.length()); // Null reference
        } catch (NullPointerException e) {
            System.out.println("Error: Null reference encountered!");
        }
    }

    // Occurs when trying to access an array element that does not exist.
    public void arrayIndexOutOfBoundsException(){
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds!");
        }
    }

    // Occurs when trying to access a character outside a string’s length.
    public void stringIndexOutOfBoundsException(){
        try {
            String text = "Java";
            System.out.println(text.charAt(10)); // Invalid index
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index is out of bounds!");
        }
    }

    // Occurs when trying to read a file that does not exist.
    public void fileNotFoundException(){
        try {
            FileReader file = new FileReader("non_existent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
    }

    // Occurs when there is an I/O operation failure (e.g., reading a file, network issue).
    public void ioException(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            System.out.println(br.readLine());
            br.close();
        } catch (IOException e) {
            System.out.println("Error: I/O operation failed!");
        }
    }

    // Occurs when trying to convert an invalid string into a number.
    public void numberFormatException(){
        try {
            int num = Integer.parseInt("Java"); // Invalid conversion
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        }
    }

    // Occurs when trying to load a class that does not exist.
    public void classNotFoundException(){
        try {
            Class.forName("com.unknown.ClassName"); // Class does not exist
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Class not found!");
        }
    }

    // Occurs when a thread is waiting or sleeping and gets interrupted.
    public void interruptedException(){
        try {
            Thread.sleep(5000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
    }

    // Occurs when a database operation fails.
    public void sqlException(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "user", "password");
            Statement stmt = conn.createStatement();
            stmt.executeQuery("SELECT * FROM invalid_table"); // Table does not exist
        } catch (SQLException e) {
            System.out.println("Error: Database error occurred!");
        }
    }

    // Java allows handling multiple exceptions separately.
    public void multipleCatchExample(){
        try {
            int[] arr = new int[5];
            arr[10] = 30 / 0; // Multiple errors: Index out of bounds & division by zero
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        }
    }

    // The finally block always executes, even if an exception occurs.
    public void finallyBlock(){
        try {
            int a = 10 / 0; // Exception occurs
        } catch (ArithmeticException e) {
            System.out.println("Exception caught!");
        } finally {
            System.out.println("Finally block executed!");
        }
    }

    // throw is used to manually throw an exception.
    // throws is used to declare exceptions in method signatures.
    public void throwAndThrows(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
}
