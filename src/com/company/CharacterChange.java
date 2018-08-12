package com.company;

import java.util.Scanner;

public class CharacterChange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String input = sc.nextLine();
        String []a = input.split(" ");

        int x =0;

        char n;
        String nextAlphabet="";

        for(int i =0;i <a.length;i++){
            for(int j =0; j < a[i].length();j++) {

                x = (int) a[i].charAt(j) + 1;
                n = (char) x;
                if (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u') {
                    n = Character.toUpperCase(n);
                }
                nextAlphabet += n;
            }
            nextAlphabet = nextAlphabet + " ";
        }
        System.out.println(nextAlphabet);
    }
}
