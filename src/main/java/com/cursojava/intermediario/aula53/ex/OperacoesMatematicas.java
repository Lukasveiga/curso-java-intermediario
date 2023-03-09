package com.cursojava.intermediario.aula53.ex;

public enum OperacoesMatematicas {

    somar("+") {
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    }, subtrair("-"){
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    }, multiplicar("*"){
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    }, dividir("/") {
        @Override
        public double executarOperacao(double x, double y) {

            if (y == 0){
                throw new ArithmeticException("Error -> Divide by 0.");
            } else {
                return x / y;
            }

        }
    };

    private final String operacao;

    OperacoesMatematicas(String operacao) {
        this.operacao = operacao;
    }

    public abstract double executarOperacao(double x, double y);

    public String getOperacao() {
        return this.operacao;
    }

    @Override
    public String toString() {
        return this.operacao;
    }
}
