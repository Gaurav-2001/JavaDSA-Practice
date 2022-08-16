package com.gaurav.PracticeProblemsFromKKVideo.LinearSearch;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        int[] garr = {18,21,-7,3,14,28};
        int[] rarr = new int[2];
        int target;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range  value: ");
        for(int i=0;i<rarr.length;i++){
            rarr[i] = in.nextInt();
        }
        System.out.print("Enter the target value: ");
        target = in.nextInt();
        for(int i=rarr[0];i<= rarr[1];i++){
            if(garr[i]==target){
                System.out.println("Position: " + i);
            }
        }
        System.out.println("Sorry not found");
    }
}
