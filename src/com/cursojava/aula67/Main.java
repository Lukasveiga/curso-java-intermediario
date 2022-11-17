package com.cursojava.aula67;

public class Main {

    public static void main(String[] args) {

        MinhaThread t1 = new MinhaThread("Thread #1", 600);
        MinhaThread t2 = new MinhaThread("Thread #2", 900);
        MinhaThread t3 = new MinhaThread("Thread #3", 500);

        t1.start();
        t2.start();
        t3.start();

    }

}
