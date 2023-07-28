package com.dsa.sortings;

import java.util.ArrayList;
import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int[] nums ={1,2,5,3,6,7,4};
        cycle(nums);
        System.out.println(Arrays.toString(nums));


    }
    static public void cycle(int[] arr){
        int i=0;
        while (i<arr.length){
            int correctindex =arr[i]-1;
            if (arr[i]!=arr[correctindex]){
                swap(arr,i,correctindex);
            }
            else {
                i++;
            }
        }
    }
    static public void swap(int [] arr,int first,int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
}
