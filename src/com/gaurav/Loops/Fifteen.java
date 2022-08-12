package com.gaurav.Loops;

import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int prd =1;
        for (int i=1;i<=n;i++) prd *= i;
        System.out.println(prd);

    }
}
