package com.gaurav.PracticeProblemsFromKKVideo.Recursion;

public class Three {
    public static void main(String[] args) {
        int[] arr = {3,4,6,8,13,15,20,23,66,78,90};
        System.out.println(BinarySearch(arr,66,0, arr.length-1));
    }
    static int BinarySearch(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end -start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target<arr[mid]){
            return BinarySearch(arr,target,start,mid-1);
        }
        return BinarySearch(arr,target,mid+1,end);
    }
}
