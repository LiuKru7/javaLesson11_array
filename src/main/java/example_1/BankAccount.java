package example_1;

import java.util.Scanner;

public class BankAccount {
    public String accountNumber;
    public double balance;
    public String holderName;
    public Scanner innerScanner = new Scanner(System.in);


    public BankAccount(String accountNumber, double balance, String holderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.holderName = holderName;
    }

    public void deposit () {
        System.out.print("Enter amount to deposit: ");
        final double enteredAmount = innerScanner.nextDouble();
        if (enteredAmount <= 0) {
            System.out.println("amount can`t be zero or negative");
            return;
        }

        this.balance += enteredAmount;
        System.out.println("Your current balance is : " + this.balance);
    }
}
