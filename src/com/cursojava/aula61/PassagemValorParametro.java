package com.cursojava.aula61;

public class PassagemValorParametro {

    public static void main(String[] args) {

        Contato contato = new Contato("Contato 1", "3633-1045", "contato1@email.com");
        int valor = 10;

        System.out.println(contato);
        System.out.println(valor);

        testePassagemValorParametro(valor, contato);
        
        System.out.println(contato);
        System.out.println(valor);

        testePassagemValorParametro2(valor, contato);

        System.out.println(contato);
        System.out.println(valor);

    }

    private static void testePassagemValorParametro(int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;

        contato = new Contato("Contato 2", "3633-1050", "contato2@email.com");
    }

    private static void testePassagemValorParametro2(int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;

        contato.setNome("Contato"+novoValor);
    }
    
}
