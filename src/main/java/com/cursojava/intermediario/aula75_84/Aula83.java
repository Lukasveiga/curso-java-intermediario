package com.cursojava.intermediario.aula75_84;

public class Aula83 {

    public static void main(String[] args) {

        //StringBuffer, Stringbuilder

        String[] letras = {"B", "C", "D", "E", "F"};
        String alfabeto = "";

        for (String letra : letras){
            alfabeto += letra;
        }

        System.out.println(alfabeto);

        StringBuilder sb = new StringBuilder();
        for (String letra : letras){
            sb.append(letra);
        }

        alfabeto = sb.toString();

        System.out.println(alfabeto);

        System.out.println(sb.reverse());

        StringBuffer sb_ = new StringBuffer(); // StringBuffer --> Thread Safe
        for (String letra : letras){
            sb_.append(letra);
        }

        alfabeto = sb_.toString();
        System.out.println(alfabeto);

    }
}
