package com.gaurav.MySirGQuestions.ElementryTrick;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int i = in.nextInt();
        if((i&1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
