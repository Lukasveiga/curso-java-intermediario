package com.cursojava.aula68;

public class Main {

    public static void main(String[] args) {

        Thread t1 = CreateNewThread("Thread #1", 500);
        Thread t2 = CreateNewThread("Thread #2", 700);
        Thread t3 = CreateNewThread("Thread #3", 900);

        t1.start();
        t2.start();
        t3.start();

    }

    public static Thread CreateNewThread(String threadName, Integer tempo) {
        return new Thread(new MinhaThreadRunnable(threadName, tempo));
    }

}
