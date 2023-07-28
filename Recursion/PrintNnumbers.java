package com.dsa.Recursion;

public class PrintNnumbers {
    public static void main(String[] args) {
        printt(10);
    }
    static void printt(int n) {
        if (n ==1){
            System.out.println(n+" ");
            return;
        }
        System.out.print(n);
        printt(n-1);
    }
}
