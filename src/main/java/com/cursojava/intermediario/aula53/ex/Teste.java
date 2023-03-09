package com.cursojava.intermediario.aula53.ex;

public class Teste {

    public static void main(String[] args) {

        double x = 5.5;
        double y = -1.5;

        for (OperacoesMatematicas operacao : OperacoesMatematicas.values()){
            System.out.printf("%.2f %s %.2f = %.2f%n", x, operacao.getOperacao(),y, operacao.executarOperacao(x, y));
        }

    }
}
