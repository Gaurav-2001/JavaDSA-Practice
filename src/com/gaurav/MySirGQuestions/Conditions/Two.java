package com.gaurav.MySirGQuestions.Conditions;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Greater number is " + (Math.max(a, b)));
    }
}
