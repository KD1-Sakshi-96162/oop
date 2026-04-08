package com.sunbeam;

public class FixedStack implements Stack {

    private Employee[] arr;
    private int top;

    public FixedStack() {
        arr = new Employee[STACK_SIZE];
        top = -1;
    }

    @Override
    public void push(Employee emp) {
        if (top == STACK_SIZE - 1) {
            System.out.println("Stack Overflow (Fixed Size)");
            return;
        }
        arr[++top] = emp;
        System.out.println("Employee pushed");
    }

    @Override
    public Employee pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        }
        return arr[top--];
    }
}