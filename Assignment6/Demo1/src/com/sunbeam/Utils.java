package com.sunbeam;

public class Utils {

    public static <T extends Number & Comparable<T>> T findMin(T[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Array is empty");

        T min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(min) < 0) {
                min = arr[i];
            }
        }
        return min;
    }
}