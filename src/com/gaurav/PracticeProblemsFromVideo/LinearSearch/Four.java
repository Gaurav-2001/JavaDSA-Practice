package com.gaurav.PracticeProblemsFromVideo.LinearSearch;

public class Four {
    public static void main(String[] args) {
        int[] arr = {18,21,-7,3,14,28};
        int minimum_number = min(arr);
        System.out.println(minimum_number);
    }

    static int min(int[] arr) {
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            if(temp>arr[i]){
                temp = arr[i];
            }
        }
        return temp;
    }
}
