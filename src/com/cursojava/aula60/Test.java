package com.cursojava.aula60;

public class Test {

    public static void main(String[] args) {

        EscopoVariaveis escopoTeste = new EscopoVariaveis();

        escopoTeste.setValor(10);

        System.out.println(escopoTeste.getValor());
        System.out.println(escopoTeste.calcularValor(20));
        System.out.println(escopoTeste.getValor());
        escopoTeste.testeEscopo();
        
    }
    
}
