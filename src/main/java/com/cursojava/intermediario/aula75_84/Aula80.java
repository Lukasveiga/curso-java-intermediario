package com.cursojava.intermediario.aula75_84;

public class Aula80 {

    public static void main(String[] args) {

        // substring, concat, replace, trim
        String test = "Isso é um teste.";
        System.out.println(test);
        System.out.println(test.substring(10));
        System.out.println(test.substring(10,15));

        String ola = "Olá";
        String mundo = " Mundo";
        System.out.println(ola.concat(mundo));

        String espacos = "i s p a ç o s";
        String semEspacos = espacos.replace("i", "e");
        semEspacos = semEspacos.replaceAll(" ", "");
        System.out.println(semEspacos);

        String nome = " meu nome é: ";
        System.out.println(nome.trim());

    }
}
