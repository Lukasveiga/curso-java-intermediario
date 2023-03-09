package com.cursojava.intermediario.aula70;

import com.cursojava.intermediario.aula69.MyThreadRunnable;

public class Test {

    public static void main(String[] args) {

        Thread t1 = new Thread(new MyThreadRunnable(500));
        Thread t2 = new Thread(new MyThreadRunnable(500));
        Thread t3 = new Thread(new MyThreadRunnable(500));

        t1.setPriority(Thread.MAX_PRIORITY); // range 1 to 10
        t2.setPriority(3);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();

    }
}
