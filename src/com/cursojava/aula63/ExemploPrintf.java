package com.cursojava.aula63;

public class ExemploPrintf {

    public static void main(String[] args) {

        System.out.printf("%s%n", "Olá, Mundo!");   
        System.out.printf("%S%n", "Olá, Mundo!");

        System.out.printf("%c%n", 'c');

        int[] valores = {1, 2, 3, 4};
        String[] posicaoes = {"primeiro", "segundo", "terceiro", "quarto"};

        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%d - %s%n", valores[i], posicaoes[i]);
        }

        String olaMundo = "Olá, Mundo!";
        System.out.printf("%20s%n", olaMundo);

        int valor = 122000;
        System.out.printf("%,d%n", valor);

        testMaisCompleto();
    }

    private static void testMaisCompleto(){

        double[] precos = {1000, 123.54, 7863.55, 1, 4.5699};

        for (int i = 0; i < precos.length; i++){
            System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i, precos[i]);
        }
    }
    
}
