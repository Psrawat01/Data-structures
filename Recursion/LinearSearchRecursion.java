package com.dsa.Recursion;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int nums[]= {2,3,4,5,7,8,6,4};
        System.out.println(Find(nums,5,0));

    }
// THIS CODE IS TO CHECK IF ELEMENT PREESENT OR NOT
//    public static boolean find(int[] arr, int target, int index) {
//        if (index == arr.length) {
//            return false;
//        }
//        return arr[index] == target && find(arr, target, index + 1);
//    }

    public static int Find(int [] arr, int target , int index){
        if (index== arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        return Find(arr,target,index+1);
    }
}
