package com.cursojava.aula62;

public class ExemploVarargs {

    public static void main(String[] args) {

        System.out.println(soma(1,2));
        System.out.println(soma(1,2,3));

        int[] vetor = {1 ,2 ,3, 4, 5};

        System.out.println(soma(vetor));

        System.out.println(soma(1 ,2 ,3, 4, 5));
        
    }

    private static int soma(int a, int b){

        return a +b;
    }

    private static int soma(int a, int b, int c){

        return a + b + c;
    }

    private static int soma(int[] vetor) {

        int total = 0;

        for (int i = 0; i < vetor.length; i++){
            total += vetor[i];
        }

        return total;
    }

    private static int soma(int a, int b, Integer... vetor) {

        int total = 0;

        for (int i = 0; i < vetor.length; i++){
            total += vetor[i];
        }

        return total;
    }

    
    
}
