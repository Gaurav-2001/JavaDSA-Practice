package com.gaurav.Conditions;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = in.nextInt();
        if(year%4==0){
            System.out.println("It's a leap Year");
        }
        else{
            System.out.println("It's not a leap year");
        }
    }
}
