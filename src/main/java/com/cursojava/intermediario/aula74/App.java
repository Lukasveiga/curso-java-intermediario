package com.cursojava.intermediario.aula74;

public class App {

    public static void main(String[] args) {

        Semaforo semaforo = new Semaforo();

        for (int i = 0; i < 10; i++) {
            System.out.println(semaforo.getCor() + " # ");
            semaforo.esperarCorMudar();

        }
        semaforo.desligarSemaforo();

    }
}
