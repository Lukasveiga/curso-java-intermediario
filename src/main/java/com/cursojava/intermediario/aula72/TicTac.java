package com.cursojava.intermediario.aula72;

public class TicTac {

    boolean tique;

    synchronized void tique(boolean estaExecutando) {

        if (!estaExecutando) {
            tique = true;
            notify();
            return;
        }

        System.out.println("Tique ");
        try {
            Thread.sleep(400);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        tique = true;

        notify();

        try {
            while (tique) {
                wait();
            }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    synchronized void taque(boolean estaExecutando) {

        if (!estaExecutando) {
            tique = false;
            notify();
            return;
        }

        System.out.println("Taque ");
        try {
            Thread.sleep(400);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        tique = false;

        notify();

        try {
            while (!tique) {
                wait();
            }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
