package com.cursojava.aula56.labs;

public enum Operadores {

    SOMAR('+') {
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    }, SUBTRAIR('-') {
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    }, MULTIPLICAR('*') {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    }, DIVIDIR('/') {
        @Override
        public double executarOperacao(double x, double y) {
            return Math.round((x / y)*100)/100D ;
        }
    };

    private char operacao;
    

    private Operadores(char operacao) {
        this.operacao = operacao;
    }

    public char getOperacao() {
        return operacao;
    }

    public abstract double executarOperacao(double x, double y);
}
