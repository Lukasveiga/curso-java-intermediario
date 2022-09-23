package com.cursojava.aula67;

public class MinhaThread extends Thread {

    private String nome;
    private int tempo;

    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
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

        MinhaThread thread = new MinhaThread("Thread #1", 600);
        MinhaThread thread2 = new MinhaThread("Thread #2", 900);
        MinhaThread thread3 = new MinhaThread("Thread #3", 500);
        
    }
}
