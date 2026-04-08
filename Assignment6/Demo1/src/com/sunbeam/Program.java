package com.sunbeam;

public class Program {
    public static void main(String[] args) {

        Integer[] intArr = {10, 5, 30, 2, 8};
        Double[] dblArr = {2.5, 1.2, 9.8, 0.5};

        System.out.println("Min Integer: " + Utils.findMin(intArr));
        System.out.println("Min Double: " + Utils.findMin(dblArr));
    }
}