package com.gaurav.PracticeProblemsFromKKVideo.InsertionSort;

import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void SelectionSort(int[] arr){
        //for outer loop
        for(int i=0;i<=arr.length-2;i++){
            //for inner loop
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
