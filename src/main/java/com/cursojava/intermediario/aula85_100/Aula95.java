package com.cursojava.intermediario.aula85_100;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula95 {

    public static void main(String[] args) {

        ResourceBundle rb = ResourceBundle.getBundle("meu-texto", Locale.getDefault());
        System.out.printf("%s %s%n", rb.getString("hello"), rb.getString("world"));

        rb = ResourceBundle.getBundle("meu-texto", new Locale("en", "US"));
        System.out.printf("%s %s%n", rb.getString("hello"), rb.getString("world"));

        rb = ResourceBundle.getBundle("meu-texto", new Locale("ca", "ES"));
        System.out.printf("%s %s%n", rb.getString("hello"), rb.getString("world"));
    }
}
