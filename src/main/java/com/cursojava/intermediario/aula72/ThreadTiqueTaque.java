package com.cursojava.intermediario.aula72;

public class ThreadTiqueTaque implements Runnable{

    TicTac tt;
    Thread t;

    private final int NUM = 5;

    public ThreadTiqueTaque(String nome, TicTac tt){

        this.tt = tt;
        t = new Thread(this, nome);
        t.start();
    }

    @Override
    public void run() {

        if(t.getName().equalsIgnoreCase("Tique")){
            for (int i = 0; i < NUM; i++){
                tt.tique(true);
            }
            tt.tique(false);
        } else {
            for (int i = 0; i < NUM; i++){
                tt.taque(true);
            }
            tt.taque(false);
        }

    }
}
