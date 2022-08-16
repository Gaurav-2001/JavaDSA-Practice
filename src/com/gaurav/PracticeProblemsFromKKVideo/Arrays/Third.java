package com.gaurav.PracticeProblemsFromKKVideo.Arrays;

import java.util.Arrays;

public class Third {
    public static void main(String[] args) {
        int[] arr = {4,18,7,56,5,40,1};
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<=(arr.length/2);i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
