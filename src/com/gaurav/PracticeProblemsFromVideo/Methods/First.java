package com.gaurav.PracticeProblemsFromVideo.Methods;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        if(isPrime(n)){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }

    static boolean isPrime(int n){
        int i;
        for(i=2;i<n;i++){
            if(n%i==0){
                break;
            }
        }
        return i == 2 || i == n;
    }
}
