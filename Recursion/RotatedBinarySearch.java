package com.dsa.Recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int nums[]={7,8,9,1,2,3,4,5,6};
        int ans = search(nums,3,0,nums.length-1);
        System.out.println(ans);

    }
    static int search(int [] nums, int target, int s , int e){
        if (s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if (nums[mid]==target){
            return mid;
        }
        if (nums[s]<=nums[mid]){
            if (target >=nums[s] && target <= nums[mid]){
                search(nums,target,s,mid-1);
            }
            else {
                search(nums,target,mid+1,e);
            }


        }
        if (target>=nums[mid] && target <= nums[s]){
            return search(nums, target,mid+1,e);
        }
        return search(nums,target,s,mid-1);


    }
}
