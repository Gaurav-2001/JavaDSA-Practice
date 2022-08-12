package com.gaurav.PracticeProblemsFromVideo.Methods;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // print all  armstrong numbers between 1 to 1000
        printArmStrong();
    }
    static void printArmStrong(){
        for(int n=1;n<=1000;n++){
            int x =n;
            int count = countdigits(n);
            int p = power(10, count);
            int sum=0;
            while(n>0){
                sum = sum + (n%10)*p;
                n=n/10;
            }
            if(sum==x)
                System.out.println("Arm = " + sum);
        }
    }

    static int power(int x, int y) {
        int prd =1;
        for(int i=1;i<y;i++){
            prd = prd*x;
        }
        return prd;
    }

    static int countdigits(int n){
        int count=0;
        if(n==0){
            return 1;
        }
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
}
