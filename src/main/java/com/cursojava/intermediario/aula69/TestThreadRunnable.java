package com.cursojava.intermediario.aula69;

public class TestThreadRunnable {

    public static void main(String[] args) {

        Thread t1 = new Thread(new MyThreadRunnable(500));
        Thread t2 = new Thread(new MyThreadRunnable(500));
        Thread t3 = new Thread(new MyThreadRunnable(500));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Program finished.");
    }
}
