package com.dsa.Recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int [] nums={ 10,12,34,36,75};
        int ans = BSR(nums,75,0, nums.length-1);
        System.out.println(ans);
    }
    static int BSR(int []arr, int target , int s , int e){
        if (s>e){ return -1; }

          int mid = s + (e - s) / 2;
          if (arr[mid] == target) {
              return mid;
          }
          if (target < arr[mid] ) {
            return BSR(arr, target, s, mid - 1);
          } else {
              return BSR(arr, target, mid + 1, e);
          }


    }
}
