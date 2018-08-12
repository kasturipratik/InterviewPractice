package com.company;

import java.util.Scanner;

public class Main {

    public static String LongestWord(String sen) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */

        String[] notops = sen.split("\\s*[^a-zA-Z0-9]+\\s*");
        int count = 0;
        String p = "";
        for (String s : notops) {
            if (s.length() > count) {
                count = s.length();
                p = s;
            }
        }
        return p;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence to find the longest word: ");
        String input = s.nextLine();

        input = LongestWord(input);
        System.out.println(input);
    }
}
