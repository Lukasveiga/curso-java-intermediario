package com.cursojava.intermediario.aula75_84;

import java.util.Arrays;

public class Aula82 {

    public static void main(String[] args) {

        // join, split
        String alfabeto = String.join(", ", "A", "B", "C", "D");
        System.out.println(alfabeto);

        String[] letras = alfabeto.split(", ");
        System.out.println(Arrays.toString(letras));

        String arquivo = "1;Antônio;30";
        String [] infos = arquivo.split(";");

        Pessoa pessoa1 = new Pessoa(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));
        System.out.println(pessoa1);

    }
}
