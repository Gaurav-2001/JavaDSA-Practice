package com.gaurav.Conditions;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if(i%5==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
