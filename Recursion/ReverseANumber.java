package com.dsa.Recursion;

public class ReverseANumber {
    public static void main(String[] args) {
        int num = 1002;
         ReverseN(num);

    }
    public static void ReverseN(int n) {
        int rev = 0;
//        if (n==0){
//            return ;
//        }
        while(n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println(rev);
    }

}
