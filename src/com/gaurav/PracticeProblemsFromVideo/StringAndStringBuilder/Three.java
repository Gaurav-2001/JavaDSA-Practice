package com.gaurav.PracticeProblemsFromVideo.StringAndStringBuilder;

public class Three {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder);

        builder.reverse();

        System.out.println(builder);
    }
}