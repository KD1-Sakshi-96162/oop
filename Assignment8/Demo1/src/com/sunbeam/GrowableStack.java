package com.sunbeam;

import java.util.Arrays;

public class GrowableStack implements Stack {

    private Employee[] arr;
    private int top;

    public GrowableStack() {
        arr = new Employee[STACK_SIZE];
        top = -1;
    }

    @Override
    public void push(Employee emp) {
        if (top == arr.length - 1) {
            // grow array
            arr = Arrays.copyOf(arr, arr.length * 2);
            System.out.println("Stack size increased");
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