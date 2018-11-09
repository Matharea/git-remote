package com.example.lib;
import java.text.Normalizer;

public class katade {

    public static String stripAccents(String input){
        return input == null ? null :
                Normalizer.normalize(input, Normalizer.Form.NFD)
                        .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }
    public static boolean isPalindrome(String word) {
        if (word == null) return false;
        word = word.toLowerCase();
        word = stripAccents(word.replaceAll(" ", ""));
        StringBuilder word2 = new StringBuilder(word);
        return word2.reverse().toString().equals(word);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Kayak"));
        System.out.println(isPalindrome("Abba"));
        System.out.println(isPalindrome("Ésope reste ici et se repose"));
        System.out.println(isPalindrome("bonjour"));
    }
}
