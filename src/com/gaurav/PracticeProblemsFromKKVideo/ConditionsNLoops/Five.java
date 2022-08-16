package com.gaurav.PracticeProblemsFromKKVideo.ConditionsNLoops;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt(), temp=0;
        while(a>0){
            int rem = a%10;
            temp = rem + (temp*10);
        }
//        int n = a, count=0;
//        if(a==0)
//            count=1;
//        while(a!=0){
//            a = a/10;
//            count++;
//        }
//        int temp = 0;
//        while(count!=0){
//            temp = temp*10+(n%10);
//            n=n/10;
//            count--;
//        }
        System.out.println("Reverse is : " + temp);
    }
}
