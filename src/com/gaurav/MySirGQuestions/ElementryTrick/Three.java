package com.gaurav.MySirGQuestions.ElementryTrick;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if((n/2)*2==n){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
