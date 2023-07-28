package com.dsa.sortings;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 24,45,34, 6};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static public void insertion(int [] arr ){
        for (int i=0; i<arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {break;}
            }
        }
    }
    static public void swap(int [] arr,int first,int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
}
