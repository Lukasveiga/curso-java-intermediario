package com.cursojava.aula70;

import com.cursojava.aula69.MinhaThreadRunnable;

public class TestePriority {

    public static void main(String[] args) {

        Thread t1 = new Thread(new MinhaThreadRunnable("Thread #1", 500));
        Thread t2 = new Thread(new MinhaThreadRunnable("Thread #2", 500));
        Thread t3 = new Thread(new MinhaThreadRunnable("Thread #3", 500));

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(5);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }

}
