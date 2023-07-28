package com.dsa.sortings;

import static com.dsa.sortings.SelectionSort.swap;

//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//There is only one repeated number in nums, return this repeated number.
//
//You must solve the problem without modifying the array nums and uses only constant extra space.
public class FindDuplicateNumber {
    public static void main(String[] args) {
   int [] nums={3,1,3,4,2};
   int ans = duplicate(nums);
        System.out.println(ans);
    }
    public static int duplicate(int [] nums){
        int i=0;
        while (i<nums.length){
            if (nums[i]!=i+1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            }
//            if (nums[i]!=i+1){
//                return i+1;
//            }
        }
        return -1;
    }
}
