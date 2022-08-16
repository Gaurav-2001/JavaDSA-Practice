package com.gaurav.PracticeProblemsFromKKVideo.CyclicSort;

import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void CyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            if(i!=arr[i]-1){
                int actualindex = arr[i]-1;
                int temp = arr[i];
                arr[i] = arr[actualindex];
                arr[actualindex] = temp;
            }
            else{
                i++;
            }
        }
    }

}
