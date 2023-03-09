package com.cursojava.intermediario.aula75_84;

import java.util.Arrays;

public class Aula77 {

    public static void main(String[] args) {

        String java = "Java";

        for (int i = 0; i < java.length();i++){
            System.out.println(java.charAt(i));
        }

        char[] javaChar = new char[java.length()];
        java.getChars(0,java.length(), javaChar, 0);
        System.out.println(javaChar);

        byte[] javaBytes = new byte[java.length()];
        java.getBytes(0, java.length(), javaBytes, 0);
        System.out.println(Arrays.toString(javaBytes));
    }
}
