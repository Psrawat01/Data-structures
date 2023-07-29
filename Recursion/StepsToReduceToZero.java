package com.dsa.Recursion;


import javax.swing.plaf.basic.BasicTreeUI;

public class StepsToReduceToZero {
    public static void main(String[] args) {
        int num = 234;
        int ans = TotalSteps(num);
        System.out.println(ans);

    }
    // the total number of steps to reduce a number to zero
    static int TotalSteps(int n){
      return helper1(n,0);
        }
        public static int helper1(int n, int steps){
        if (n==0){
            return steps;
        }
        if (n%2==0){
            return helper1(n/2,steps+1);
        }
        return helper1(n-1,steps+1);
    }
}
