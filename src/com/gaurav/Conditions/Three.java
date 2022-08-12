package com.gaurav.Conditions;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c =  in.nextInt();
        System.out.println("Greater number is " + Math.max(Math.max(a, b),c));
    }
}
