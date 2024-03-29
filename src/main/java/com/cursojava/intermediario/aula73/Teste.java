package com.cursojava.intermediario.aula73;

public class Teste {

    public static void main(String[] args) {

        MinhaThread t1 = new MinhaThread("#1");
        MinhaThread t2 = new MinhaThread("#2");

        t1.suspend();

        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t2.suspend();

        t1.resume();

        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t2.resume();

        t2.stop();
    }
}
