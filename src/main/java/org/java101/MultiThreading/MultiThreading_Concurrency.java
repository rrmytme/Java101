/*
Java supports multithreading, allowing multiple tasks to run in parallel.

In Java , multithreading is a feature that allows concurrent execution of multiple parts of a program.
This maximises CPU utilisation.
Each part that is executed is called a thread, and they act like components within a process.
Concurrency is achieved through the Thread class or Runnable interface implementation.
 */

package org.java101.MultiThreading;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class MultiThreading_Concurrency {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // Starts a new thread
    }
}
