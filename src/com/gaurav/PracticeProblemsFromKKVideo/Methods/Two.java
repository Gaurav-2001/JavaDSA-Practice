package com.gaurav.PracticeProblemsFromKKVideo.Methods;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // print all  armstrong numbers between 1 to 1000
        for(int i=1;i<=1000;i++){
            if(arm(i)){
                System.out.println(i);
            }
        }
    }

    static boolean arm(int n) {
        int x=n,count=0;
        while(x!=0){
            x=x/10;
            count++;
        }
        x=n;
        int sum =0;
        while(n!=0){
            int p = power(n%10,count);
            sum = sum+p;
            n=n/10;
        }
        return sum==x;
    }

    static int power(int x, int y) {
        int prd=1;
        for(int i=1;i<=y;i++){
            prd=prd*x;
        }
        return prd;
    }
}
