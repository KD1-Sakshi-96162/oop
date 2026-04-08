package com.sunbeam;



import java.util.Scanner;
import com.sunbeam.*;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack stack = null; // interface reference

        int choice;

        do {
            System.out.println("\n1. Fixed Stack");
            System.out.println("2. Growable Stack");
            System.out.println("3. Push Employee");
            System.out.println("4. Pop Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:
                if (stack == null) {
                    stack = new FixedStack();
                    System.out.println("Fixed Stack selected");
                } else {
                    System.out.println("Stack already selected!");
                }
                break;

            case 2:
                if (stack == null) {
                    stack = new GrowableStack();
                    System.out.println("Growable Stack selected");
                } else {
                    System.out.println("Stack already selected!");
                }
                break;

            case 3:
                if (stack == null) {
                    System.out.println("No stack chosen!!!");
                } else {
                    System.out.print("Enter id: ");
                    int id = sc.nextInt();
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter salary: ");
                    double sal = sc.nextDouble();

                    stack.push(new Employee(id, name, sal));
                }
                break;

            case 4:
                if (stack == null) {
                    System.out.println("No stack chosen!!!");
                } else {
                    Employee e = stack.pop();
                    if (e != null)
                        System.out.println("Popped: " + e);
                }
                break;

            case 5:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}