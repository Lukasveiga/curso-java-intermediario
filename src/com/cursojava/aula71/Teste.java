package com.cursojava.aula71;

public class Teste {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        Thread t1 = new Thread(new MinhaThreadSoma("Thread #1", array));
        Thread t2 = new Thread(new MinhaThreadSoma("Thread #2", array));

        t1.start();
        t2.start();
        
    }
    
}
