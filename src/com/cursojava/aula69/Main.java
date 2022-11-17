package com.cursojava.aula69;

public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(new MinhaThreadRunnable("Thread 1", 400));
        Thread t2 = new Thread(new MinhaThreadRunnable("Thread 2", 400));
        Thread t3 = new Thread(new MinhaThreadRunnable("Thread 3", 400));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Programa finalizado.");

    }

}
