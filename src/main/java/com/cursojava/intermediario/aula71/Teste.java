package com.cursojava.intermediario.aula71;

public class Teste {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        Thread t1 = new Thread(new MyThreadSum("#1", array));
        Thread t2 = new Thread(new MyThreadSum("#2", array));
        Thread t3 = new Thread(new MyThreadSum("#3", array));

    }

}
