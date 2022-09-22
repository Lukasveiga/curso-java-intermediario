package com.cursojava.aula56.labs;

import com.cursojava.aula56.labs.Calculadora.Operadores;

public class TestEnum {

    public static void main(String[] args) {

        int x = 2;
        int y = 6;

        Operadores[] operadores = Operadores.values();

        System.out.println("---- Opreçãoes ----\n");

        for (Operadores op: operadores) {
            System.out.println(op + ": ");
            System.out.println(x + " " + op.getOperacao() + " " + y + " = " + op.executarOperacao(x, y));
        }
        
    }
    
}
