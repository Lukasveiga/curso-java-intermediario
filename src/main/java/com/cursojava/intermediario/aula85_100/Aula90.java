package com.cursojava.intermediario.aula85_100;

import java.util.Locale;

public class Aula90 {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        System.out.println(locale);

        Locale[] locales = Locale.getAvailableLocales();

        for (Locale l : locales){
            System.out.println("Nome: " + l.getDisplayName());
            System.out.println("Código: " + l.getLanguage());
            System.out.println("Língua: " + l.getDisplayLanguage());
            System.out.println("Cod País: " + l.getCountry());
            System.out.println("País: " + l.getDisplayCountry());
            System.out.println("***************************");
        }

    }
}
