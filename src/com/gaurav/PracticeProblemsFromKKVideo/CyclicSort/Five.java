package com.gaurav.PracticeProblemsFromKKVideo.CyclicSort;

import static com.gaurav.PracticeProblemsFromKKVideo.CyclicSort.Four.swap;

public class Five {
    public static void main(String[] args) {
        int[]  arr = {3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] arr) {
        int i=0;
        while(i<=arr.length-1){
            if(arr[i]-1!=i && arr[arr[i]-1]!=arr[i]){
                //swap
                int actual = arr[i]-1;
                swap(arr,i,actual);
            }
            else{
                i++;
            }
        }
        return arr[arr.length-1];
    }
}
