package com.gaurav.PracticeProblemsFromKKVideo.ConditionsNLoops;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().trim().charAt(0);
        if(c>='a' && c<='z'){
            System.out.println("Lowercase");
        }
        else if(c>='A' && c<='Z'){
            System.out.println("Uppercase");
        }
        else {
            System.out.println("Enter a valid input");
        }
    }
}
