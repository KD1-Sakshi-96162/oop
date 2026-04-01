package de;
import java.util.Scanner;

class Customer {
    private int accountNumber;
    private int beginningBalance;
    private int totalCharges;
    private int totalCredits;
    private int creditLimit;

    // Constructor
    public Customer(int accountNumber, int beginningBalance, int totalCharges, int totalCredits, int creditLimit) {
        this.accountNumber = accountNumber;
        this.beginningBalance = beginningBalance;
        this.totalCharges = totalCharges;
        this.totalCredits = totalCredits;
        this.creditLimit = creditLimit;
    }

    // Method to calculate new balance
    public int calculateNewBalance() {
        return beginningBalance + totalCharges - totalCredits;
    }

    // Method to display result
    public void displayStatus() {
        int newBalance = calculateNewBalance();

        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("New Balance: " + newBalance);

        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        } else {
            System.out.println("Within credit limit");
        }
    }
}

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for Customer " + i);

            System.out.print("Account Number: ");
            int accNo = sc.nextInt();

            System.out.print("Beginning Balance: ");
            int balance = sc.nextInt();

            System.out.print("Total Charges: ");
            int charges = sc.nextInt();

            System.out.print("Total Credits: ");
            int credits = sc.nextInt();

            System.out.print("Credit Limit: ");
            int limit = sc.nextInt();

            // Create object
            Customer c = new Customer(accNo, balance, charges, credits, limit);

            // Display result
            c.displayStatus();
        }

        sc.close();
    }
}