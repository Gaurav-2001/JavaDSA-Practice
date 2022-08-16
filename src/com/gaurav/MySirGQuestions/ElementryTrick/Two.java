package com.gaurav.MySirGQuestions.ElementryTrick;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second nummber: ");
        int b = in.nextInt();
        int temp = a^b;
        System.out.println(temp);
        b = temp^a;
        a = temp^b;
        System.out.println("A = " + a + " B = " + b );
    }
}
