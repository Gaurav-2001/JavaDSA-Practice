package com.gaurav.Loops;

import java.util.Scanner;

public class Sixteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x and y: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int prd =1;
        for(int i=1;i<=y;i++) prd = prd * x;
        System.out.println("Product = " + prd);
    }
}
