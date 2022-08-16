package com.gaurav.MySirGQuestions.ElementryTrick;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A = " + a + " B = " + b);
    }
}
