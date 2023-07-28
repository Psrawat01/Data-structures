package com.dsa.sortings;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 24, 6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static public void bubble(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
