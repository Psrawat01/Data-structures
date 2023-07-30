package com.dsa.sortings;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        Quick(arr,0,arr.length-1);
        for (int i = 0; i <arr.length-1 ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void Quick(int[]arr, int start , int end){
        if (start>=end){
            return;
        }
        int s = start;
        int e= end;
        int mid = s+(e-s)/2;
        int piv = arr[mid];// here taking mid element as pivot
        while (s<=e){
            while (arr[s]<piv){
                s++;
            }
            while (arr[e]>piv){
                e--;
            }
            if (s<=e){
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]= temp;
                s++;e--;
            }
            Quick(arr,start,e);
            Quick(arr,s,end);
        }

    }
}
