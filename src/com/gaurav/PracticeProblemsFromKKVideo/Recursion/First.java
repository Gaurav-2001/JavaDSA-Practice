package com.gaurav.PracticeProblemsFromKKVideo.Recursion;

public class First {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static int fact(int n){
        int prd =1;
        if(n==1){
            return 1;
        }
        prd = n * fact(n-1);
        return prd;
    }
}