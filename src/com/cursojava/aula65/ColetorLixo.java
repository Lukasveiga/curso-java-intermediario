package com.cursojava.aula65;

import com.cursojava.aula61.Contato;

public class ColetorLixo {

    public static void obterMemoriaUsada() {

        final int MB = 1024 * 1024;

        Runtime runtime = Runtime.getRuntime();

        System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);
    }

    public static void main(String[] args) {

        Contato[] contatos = new Contato[10000];
        Contato contato;

        for (int i = 0; i < contatos.length; i++){

            contato = new Contato("Contato"+i, "1234-558"+i, "contato"+i+"@email.com");
            contatos[i] = contato;

        }

        System.out.println("Contatos criadas.");

        obterMemoriaUsada();

        contatos = null;

        // Normalmente não é utilizado
        Runtime.getRuntime().runFinalization();

        Runtime.getRuntime().gc();

        System.out.println("Contatos removidos da memoria.");

        obterMemoriaUsada();
    }
    
}
