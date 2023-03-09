package com.cursojava.intermediario.aula53;

public enum DiaSemana {

    SEGUNDA(1, "Segunda-Feira"), TERCA(2, "Terça-Feira"),
    QUARTA(3, "Quarta-Feira"), QUINTA(4, "Quinta-Feira"),
    SEXTA(5, "Sexta-Feira"), SABADO(6,"Sábado"), DOMINGO(7, "Domingo");

    private final int valor;
    private final String nomeCompleto;

    DiaSemana(int valor, String nomeCompleto) {
        this.valor = valor;
        this.nomeCompleto = nomeCompleto;
    }

    public int getValor(){
        return this.valor;
    }

    public String getNomeCompleto(){
        return this.nomeCompleto;
    }

    @Override
    public String toString() {
        return "DiaSemana{" +
                "Valor:" + valor +
                ", Dia: '" + nomeCompleto + '\'' +
                '}';
    }
}
