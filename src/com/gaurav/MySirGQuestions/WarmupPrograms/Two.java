package com.gaurav.MySirGQuestions.WarmupPrograms;

import java.util.Scanner;

public class Two {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int r = in.nextInt();
        System.out.println("The area of the circle is " + (double)(Math.PI*r*r));
    }
}
