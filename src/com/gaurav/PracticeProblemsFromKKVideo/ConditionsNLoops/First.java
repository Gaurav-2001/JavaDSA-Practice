package com.gaurav.PracticeProblemsFromKKVideo.ConditionsNLoops;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println("Largest one is " + Math.max(Math.max(a,b),c));
    }
}
