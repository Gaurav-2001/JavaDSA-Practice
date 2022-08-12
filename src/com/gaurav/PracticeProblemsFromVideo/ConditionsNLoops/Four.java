package com.gaurav.PracticeProblemsFromVideo.ConditionsNLoops;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long a = in.nextInt();
        System.out.print("Enter the Target value: ");
        int t = in.nextInt();
        int count=0;
        while(a!=0){
            if(a%10==t){
                count++;
            }
            a = a/10;
        }
        System.out.println("Count = " + count);
//        Integer i = (int)(long)a;
//        String test  = i.;
//        for (int k=0;k<test.length();k++){
//        }
    }
}
