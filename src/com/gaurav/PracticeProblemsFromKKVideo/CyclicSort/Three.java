package com.gaurav.PracticeProblemsFromKKVideo.CyclicSort;

import java.util.Arrays;

public class Three {
    public static void main(String[] args) {
        int[] arr = {0,1,2};
        System.out.println(MissingNumbers(arr));
    }
    static int MissingNumbers(int[] arr){
        int i=0;
        while(i<=arr.length-1){
            if(arr[i]!=i){
                int actualIndex = arr[i];
                if(actualIndex == arr.length){
                    i++;
                }
                else{
                    swap(arr,i,actualIndex);
                }
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(i=0;i<=arr.length-1;i++){
            if(arr[i]!=i){
                break;
            }
        }
        return i;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
