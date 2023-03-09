package com.cursojava.intermediario.aula71;

public class Calculadora {
    public synchronized int somaArray(int[] array){

        int soma = 0;

        for (int j : array) {
            soma += j;

            System.out.println("Executing the sum: " + Thread.currentThread().getName() + " sum value " + j + " with total equal to " + soma);

            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        return soma;
    }
}
