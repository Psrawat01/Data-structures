package com.dsa.sortings;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 24, 6};
        selection(arr);
        System.out.println(Arrays.toString(arr));


    }
    static public void selection(int[] arr){
        for (int i= 0;i<arr.length;i++){
            int end = arr.length-i-1;
            int maxindex= getmax(arr,0,end);
            swap(arr,maxindex,end);
        }
    }
    static public int getmax(int [] arr ,int start, int end){
        int max= start;
        for (int i =0;i<= end;i++){
            if (arr[max]<arr[i]){
                max= i;
            }
        }
        return max;
    }
    static public void swap(int [] arr,int first,int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
}
