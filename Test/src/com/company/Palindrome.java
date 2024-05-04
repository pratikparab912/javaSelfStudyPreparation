package com.company;

public class Palindrome {

    public static boolean isPalindrome(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        return stringBuilder.reverse().toString().equals(input);
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("markram"));
    }

}
