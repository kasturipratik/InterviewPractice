package com.company;

import java.util.Scanner;

public class FirstFactorial {
    public static int FirstFactorial(int num) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
        int a =1;
        for(int i =1; i <= num ;i ++){
            a = a *i;
        }

        return a;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number for its factoral calculation:");
        System.out.print(FirstFactorial(s.nextInt()));

        String a = "hello";
        String reverse ="";
        for(int i =1;i <=a.length() ;i++){
            reverse += a.charAt(a.length() -i);

        }
        System.out.println(reverse);

    }
}
