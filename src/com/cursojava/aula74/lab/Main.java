package com.cursojava.aula74.lab;

public class Main {

    public static void main(String[] args) {

        Semaforo semaforo = new Semaforo();

        for (int i = 0; i < 10; i++) {
            System.out.println(semaforo.getCor() + " # ");
            semaforo.esperarCorMudar();

        }
        semaforo.desligarSemaforo();
    }

}
