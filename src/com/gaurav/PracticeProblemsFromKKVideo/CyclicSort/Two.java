package com.gaurav.PracticeProblemsFromKKVideo.CyclicSort;

public class Two {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(MissingNumber1(arr));
    }

    static int MissingNumber2(int[] nums){
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

    static int MissingNumber1(int[] nums){
        int i;
        int[] arr1 = new int[nums.length+1];
        for(i=0;i<=nums.length-1;i++){
            if(nums[i]==0){
                break;
            }
        }
        if(i==nums.length){
            return 0;
        }
        for(i=0;i<=nums.length-1;i++){
            int value = nums[i];
            arr1[value]=value;
        }
        for(i=0;i<=arr1.length-1;i++){
            if(arr1[i]!=i){
                break;
            }
        }
        return i;
    }
}
