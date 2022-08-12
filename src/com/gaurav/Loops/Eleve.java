package com.gaurav.Loops;

import java.util.Scanner;

public class Eleve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        for (int i=2*n; i>0; i--){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
