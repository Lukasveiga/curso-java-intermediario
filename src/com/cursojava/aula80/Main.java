package com.cursojava.aula80;

public class Main {

    public static void main(String[] args) {

        String teste = "Isso é um teste.";

        System.out.println(teste);
        System.out.println(teste.substring(teste.indexOf(" ") + 1));

        String espacos = "i s p a ç o s";
        String semEspacos = espacos.replace("i", "e");
        semEspacos = semEspacos.replaceAll(" ", "");
        System.out.println(semEspacos);

        String nome = " meu nome é: ";
        System.out.println(nome);
        System.out.println(nome.trim());

        
    }
    
}
