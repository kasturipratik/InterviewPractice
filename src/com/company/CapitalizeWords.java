package com.company;

public class CapitalizeWords {
    public static void main(String[] args) {
        String str = "hi i am pratik";
        String a[] = str.split(" ");


        String result ="";
        for(int i =0; i < a.length;i++){

            String change="";

            char n = a[i].charAt(0);

            n = Character.toUpperCase(n);

            for(int j =1; j < a[i].length();j++){
                change += a[i].charAt(j);

            }

            result += n+change +" ";
        }
        System.out.println(result);
    }
}
