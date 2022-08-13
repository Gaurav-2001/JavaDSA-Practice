package com.gaurav.PracticeProblemsFromVideo.BinarySearch;

public class Two {
    public static void main(String[] args) {
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 22;
        int index = OrderAugnisticBinarySearch(arr,target);
        System.out.println(index);
    }

    static int OrderAugnisticBinarySearch(int[] arr, int target) {
        int start =0;
        int end =arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                start = mid+1;
            }
            else if(target>arr[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
