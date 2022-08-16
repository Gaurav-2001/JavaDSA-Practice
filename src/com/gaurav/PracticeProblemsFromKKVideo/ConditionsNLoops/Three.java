package com.gaurav.PracticeProblemsFromKKVideo.ConditionsNLoops;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int a=-1,b=1;
        int c = a+b;

        //Code for printing n Fibonacci numbers
//        for(int i=0;i<n;i++){
//            System.out.println(c);
//            a=b;
//            b=c;
//            c=a+b;
//        }
        for(int i=0;i<n;i++){
            a=b;
            b=c;
            c=a+b;
        }
        System.out.println("Fib. number is " + c);
    }
}
