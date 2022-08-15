package com.gaurav.PracticeProblemsFromVideo.BubbleSort;

import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void BubbleSort(int[] arr){
        // for the outer loop
        boolean isSwap;
        for(int i=0;i<=arr.length-1;i++){
            //for the inner loop
            isSwap = false;
            for(int j=1;j<=arr.length-1-i;j++){
                if(arr[j]>arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSwap = true;
                }
            }
            if(!isSwap){
                break;
            }
        }
    }
}
