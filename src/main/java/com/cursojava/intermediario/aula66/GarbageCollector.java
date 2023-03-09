package com.cursojava.intermediario.aula66;

public class GarbageCollector {

    public static void main(String[] args) {

        Contato[] contatos = new Contato[10_000];
        Contato contato;

        for (int i = 0; i < contatos.length; i++){
            contato = new Contato("Contato"+i, "6336-105"+i, "contato"+i+"@email.com");
            contatos[i] = contato;
        }

        System.out.println("Contatos criados");

        obterMemoriaUsada();

        contatos = null;

        Runtime.getRuntime().runFinalization();

        Runtime.getRuntime().gc();

        System.out.println("Contatos removidos da memória");

        obterMemoriaUsada();

    }

    public static void obterMemoriaUsada(){

        final int MB = 1024 * 1024;

        Runtime runtime = Runtime.getRuntime();

        System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);

    }
}
