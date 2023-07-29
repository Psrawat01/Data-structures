package com.dsa.Recursion;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4};
        System.out.println(SortOrNot(arr,0));

    }
    // works when all elements are different in the array
    static boolean SortOrNot(int [] nums, int index){
        if (index== nums.length-1){
            return true;
        }
        return nums[index]<nums[index+1] && SortOrNot(nums,index+1);
    }
}
