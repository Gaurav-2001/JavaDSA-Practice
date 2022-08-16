package com.gaurav.PracticeProblemsFromKKVideo.BinarySearch;

import java.util.Arrays;

public class Five {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,7,8,8,10};
        int target = 7;
        int[] arr = SearchRange(nums,target);
        System.out.println(Arrays.toString(arr));
    }

    static int[] SearchRange(int[] arr, int target) {
        return new int[]{BinarySearch(arr,target,true), BinarySearch(arr,target,false)};
    }
    static int BinarySearch(int[] arr, int target, boolean isFirst){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                //Potential Answer is found
                ans=mid;
                if(isFirst){
                    //true
                    end =mid-1;
                }
                else{
                    //false
                    start = mid+1;
                }
            }
        }
        return ans;
    }
    }
