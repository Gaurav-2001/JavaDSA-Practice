package com.gaurav.PracticeProblemsFromVideo.CyclicSort;

public class Three {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(MissingNumber(arr));
    }
    static int MissingNumber(int[] nums){
        int i=0;
        while(i<=nums.length-1){
            if(nums[i]!=i){
                if(nums[i]==nums.length){
                    swap(nums,i,nums.length-1);
                    if(i==nums.length-1){
                        i++;
                    }
                }
                else {
                    swap(nums,i,nums[i]);
                }
            }
            else{
                i++;
            }
        }
         for(i=0;i<=nums.length-1;i++){
             if(nums[i]!=i){
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
