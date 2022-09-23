package com.cursojava.aula69;

public class MinhaThreadRunnable2 implements Runnable {

    private String nome;
    private int tempo;

    public MinhaThreadRunnable2(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
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

        MinhaThreadRunnable2 thread1 = new MinhaThreadRunnable2("Thread #1", 500);
        MinhaThreadRunnable2 thread2 = new MinhaThreadRunnable2("Thread #2", 700);
        MinhaThreadRunnable2 thread3 = new MinhaThreadRunnable2("Thread #3", 900);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Programa finalizado.");
        
    }
        
}
