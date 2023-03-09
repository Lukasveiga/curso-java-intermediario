package com.cursojava.intermediario.aula74;

public enum Cores {

    VERDE("\u001B[32m", 2000), AMARELO("\u001B[33m", 1000), VERMELHO("\u001B[31m", 2000);

    private final String cor;
    private final int tempoEspera;

    Cores(String cor, int tempoEspera) {
        this.cor = cor;
        this.tempoEspera = tempoEspera;
    }

    public String getCor() {
        return cor;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }
}
