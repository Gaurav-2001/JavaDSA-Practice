package com.gaurav.PracticeProblemsFromKKVideo.Recursion;

public class Two {
    public static void main(String[] args) {
        System.out.println(fib(7));
    }
    static int fib(int n){
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        return fib(n-1) + fib(n-2);
    }
}
