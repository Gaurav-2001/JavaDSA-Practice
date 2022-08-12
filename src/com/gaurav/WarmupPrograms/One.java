package com.gaurav.WarmupPrograms;

import java.util.Scanner;

public class One {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int a = in.nextInt();
        System.out.print("Enter Second number: ");
        int b = in.nextInt();
        System.out.println("Sum of the numbers is " + (int)(a+b));
    }
}
