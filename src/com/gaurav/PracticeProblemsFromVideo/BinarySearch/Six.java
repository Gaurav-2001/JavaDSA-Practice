package com.gaurav.PracticeProblemsFromVideo.BinarySearch;

public class Six {
    public static void main(String[] args) {
        int[] arr = {4,6,7,9,20,22,56,78,98,101,130};
        int target = 98;
        System.out.println(BinarySearchOnInfiniteArray(arr,target));
    }
    static int BinarySearchOnInfiniteArray(int[] arr, int target){
        int start=0,end=1,count=1;
        if(target<arr[0]){
            return -1;
        }
        while(true){
            start=count;
            end=count+1;
            if(arr[start]<=target && arr[end]>=target){
                return BinarySearch(arr,target,start,end);
            }
            count+=7;
        }
//        while(target>arr[end]){
//            int newStart = end+1;
//            end = end + ()
//        }
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        while(start<=end){
            int mid = start+(end-start)/2;
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
        return -1;
    }
}
