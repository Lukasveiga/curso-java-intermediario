package com.cursojava.aula74.lab;

public enum Colors {

    VERDE("\u001B[32m", 2000), AMARELO("\u001B[33m", 1000), VERMELHO("\u001B[31m", 2000);

    private String cor;
    private int tempoEspera;

    private Colors(String cor, int tempoEspera) {
        this.cor = cor;
        this.tempoEspera = tempoEspera;
    }

    public String getCor(){
        return cor;
    }

    public int getTempoEspera(){
        return tempoEspera;
    }

}
