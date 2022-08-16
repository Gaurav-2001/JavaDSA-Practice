package com.gaurav.PracticeProblemsFromKKVideo.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
      //  test_Arraylist();
      //  input_Array();
        MultiDimArrayList();
    }

    static void MultiDimArrayList() {
        Scanner in = new Scanner(System.in);
        //Declaration
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        //add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }

    static void input_Array() {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
    }

    static void test_Arraylist() {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> test = new ArrayList<>(5);
        for(int i=0;i<5;i++){
            test.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(test.get(i));
        }

        System.out.println(test);
    }
}
