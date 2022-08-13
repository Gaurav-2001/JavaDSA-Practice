package com.gaurav.PracticeProblemsFromVideo.BinarySearch;

public class Four {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int index = floor(arr,target);
        System.out.println(arr[index]);
    }

    static int floor(int[] arr, int target) {
        if(target<arr[0]){
            return -1;
        }
        int start =0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}