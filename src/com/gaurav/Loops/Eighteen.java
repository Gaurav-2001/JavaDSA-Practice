package com.gaurav.Loops;

import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum =0;
        while(n!=0){
            sum = sum+(n%10);
            n=n/10;
        }
        System.out.println("Sum is " + sum);
    }
}
