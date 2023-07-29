package com.dsa.Recursion;

public class CountZeroesInNumber {
    public static void main(String[] args) {
        int num = 2030480;
        System.out.println(count(num));
    }

    public static int count(int n){
        return helper(n,0);
    }
   private static int helper(int number,int count){
        if (number==0){
            return count;
        }
        int rem =number%10;
        if (rem==0){
            return helper(number/10,count+1);
        }
        return helper(number/10,count);
    }
}
