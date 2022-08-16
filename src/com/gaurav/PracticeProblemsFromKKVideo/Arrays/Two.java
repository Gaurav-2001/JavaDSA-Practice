package com.gaurav.PracticeProblemsFromKKVideo.Arrays;

public class Two {
    public static void main(String[] args) {
        int[] arr = {4,18,7,56,5,40};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
