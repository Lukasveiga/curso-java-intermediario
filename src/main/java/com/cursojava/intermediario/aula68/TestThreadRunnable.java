package com.cursojava.intermediario.aula68;

public class TestThreadRunnable {

    public static void main(String[] args) {

        MyThreadRunnable trhead1 = new MyThreadRunnable(500);
        MyThreadRunnable trhead2 = new MyThreadRunnable(700);
        MyThreadRunnable trhead3 = new MyThreadRunnable(1000);
    }
}
