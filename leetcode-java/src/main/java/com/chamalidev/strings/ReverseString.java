package com.chamalidev.strings;

public class ReverseString {
    private static String reverseStr(String word){
        String reverserdWord="";
        for(int i=word.length()-1;i>=0;i--){
            reverserdWord=reverserdWord+word.charAt(i);
        }
        return reverserdWord;
    }

    public static void main(String[] args){
        System.out.println(reverseStr("chamali"));
    }
}
