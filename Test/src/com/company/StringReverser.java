package com.company;

public class StringReverser {

    public static String reverse(String input) {
        String result = "";

        for(int i = input.length()-1; i>=0; i--) {
            result = result + input.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(StringReverser.reverse("pratik"));
    }

}
