package com.company;

public class StringUtil {

   static String word = "hello world";

    public static void main(String[] args) {
        String s = trim(word);
        System.out.println(s);
    }

    public static String trim(String text){
        int i;
        int j;
        j = text.length()-1;
        i=2;
        j=5;

        while (text.charAt(i) == ' '){
            i++;
        }
        while (text.charAt(j) == ' ') {
            j--;
        }

        return text.substring(i,j+1);

    }

}
