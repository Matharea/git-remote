package com.example.lib;

public class Kataun {

    public  static  int distance (String word1, String word2){
        int res = 0;
        if (word1 == null || word2 == null)
                return res;
        res += Math.abs(word1.length() - word2.length());
        int len = Math.min(word1.length(), word2.length());
        for (int i=0; i<len; i++ ){
            if(word1.charAt(i) != word2.charAt(i))
                res++;
        }
        return res;
    }

    public static void main(String...args){
        System.out.println(distance(null
                ,""));

    }

}
