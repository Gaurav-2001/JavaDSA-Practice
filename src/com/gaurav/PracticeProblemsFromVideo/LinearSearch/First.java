package com.gaurav.PracticeProblemsFromVideo.LinearSearch;

public class First {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        LinearSearch(nums,target);
    }

    static boolean LinearSearch(int[] nums, int target) {
        if(nums.length == 0){
            return false;
        }
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
