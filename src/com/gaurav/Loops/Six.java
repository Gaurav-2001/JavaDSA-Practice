package com.gaurav.Loops;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 10;
        for(int i=1;i<=2*n;i++){
            if(i%2==0)
                System.out.println(i);
        }
    }
}
