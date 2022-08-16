package com.gaurav.MySirGQuestions.Loops;

import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        /*
        n=1234 count=1
        n/10 = 123 count=2
        n/10 = 12 count=3
        n/10 = 1 count=4
        n/10=0 break
        */
        int count=1;
        while(n/10!=0){
            n = n/10;
            count++;
        }
        System.out.println("Number of digits is " + count);
    }
}
