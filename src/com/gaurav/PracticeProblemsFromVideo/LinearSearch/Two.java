package com.gaurav.PracticeProblemsFromVideo.LinearSearch;

public class Two {
    public static void main(String[] args) {
        String name = "Gaurav";
        int target = 'r';
        System.out.println("The target exist at the position " + exist2(name,target));
    }
    static int exist2(String name, int target){
        if(name.length()==0){
            return -1;
        }
        for (int i=0;i<name.length();i++){
            if(name.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
    static int exist1(String name, int taarget){
        char[] naam = name.toCharArray();
        if(naam.length==0){
            return -1;
        }
        for (int i = 0; i < naam.length; i++) {
            if(naam[i]==taarget){
                return i;
            }
        }
        return -1;
    }
}
