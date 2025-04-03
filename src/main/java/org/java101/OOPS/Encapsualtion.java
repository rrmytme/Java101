// Encapsulation is data hiding by using private variables and public methods.

package org.java101.OOPS;

class BankAccount {
    private double balance; // Encapsulated field

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Encapsualtion {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        System.out.println("Balance: " + account.getBalance()); // Output: 1500
    }
}
