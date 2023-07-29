package com.dsa.sortings;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int[] ans = mergesort(arr);
        for (int i = 0; i <ans.length-1 ; i++) {
            System.out.print(ans[i]+" ");
        }

    }

    static int[] mergesort(int[] arr){
        if (arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    static int[] merge(int []first , int[] second){
        int [] mix= new int[first.length+second.length];
        int i=0;//first array
        int j=0;//second array
        int k=0; // mixed array
        while (i< first.length && j< second.length){
            if (first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        // adding remaining elements in a particular array
        while (i< first.length){
            mix[k]= first[i];
            k++;i++;
        }
        while (j< second.length){
            mix[k]=second[j];
            k++;j++;
        }
        return mix;
    }
}
