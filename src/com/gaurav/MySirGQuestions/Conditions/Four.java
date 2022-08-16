package com.gaurav.MySirGQuestions.Conditions;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int temp = (b*b)-(4*a*c);
        if (temp < 0){
            System.out.println("Roots does not exist");
        }
        else{
            double sqrt = Math.sqrt(temp);
            double root1 = (-b + sqrt)/(2*a);
            double root2 = (-b - sqrt)/(2*a);
            System.out.println("Root1 = " + root1 + "Root2 = " + root2);
        }
    }
}
