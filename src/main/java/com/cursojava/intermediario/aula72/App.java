package com.cursojava.intermediario.aula72;

public class App {

    public static void main(String[] args) {

        TicTac tt = new TicTac();
        ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tt);
        ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tt);

        try {
            tique.t.join();
            taque.t.join();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
