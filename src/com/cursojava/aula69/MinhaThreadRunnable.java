package com.cursojava.aula69;

public class MinhaThreadRunnable implements Runnable {

    private String nome;
    private int tempo;

    public MinhaThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 6; i++) {

                System.out.println(nome + " contador: " + i);

                Thread.sleep(tempo);
                
            }
        } catch (InterruptedException e) {
            System.out.println(nome + " foi interrompida.");
        }

        System.out.println(nome + " terminou a execução.");
    }

    public static void main(String[] args) {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", 700);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", 900);

        System.out.println("Programa finalizado.");
        
    }
        
}
