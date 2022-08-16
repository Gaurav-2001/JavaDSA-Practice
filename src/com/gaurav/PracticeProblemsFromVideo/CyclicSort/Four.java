package com.gaurav.PracticeProblemsFromVideo.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four {
    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(findDisapperaredNumbers(arr));
    }
    static List<Integer> findDisapperaredNumbers(int[] arr){
        ArrayList<Integer> list = new ArrayList<>(1);
        int i=0;
        while(i<=arr.length-1){
            if(arr[i]-1!=i && arr[arr[i]-1]!=arr[i]){
                int actualIndex = arr[i]-1;
                swap(arr,i,actualIndex);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(i=0;i<=arr.length-1;i++){
            if(arr[i]-1!=i){
                list.add(i+1);
            }
        }
        return list;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
