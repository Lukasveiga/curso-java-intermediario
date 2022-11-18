package com.cursojava.aula74.lab;

public class Semaforo implements Runnable {

    private Colors cor;
    private boolean parar = false;
    private boolean corMudou = false;

    public Semaforo() {
        this.cor = Colors.VERMELHO;
        new Thread(this).start();
    }

    @Override
    public void run() {

        while (!parar) {
            try {
                Thread.sleep(this.cor.getTempoEspera());
                this.mudarCor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    private synchronized void mudarCor() {
        switch (this.cor) {
            case VERMELHO:
                this.cor = Colors.VERDE;
                break;
            case AMARELO:
                this.cor = Colors.VERMELHO;
                break;
            case VERDE:
                this.cor = Colors.AMARELO;
            default:
                break;
        }
        this.corMudou = true;
        notify();
    }

    public synchronized void esperarCorMudar() {
        while (!corMudou) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.corMudou = false;
    }

    public synchronized void desligarSemaforo(){
        this.parar = true;
    }

    public String getCor(){
        return this.cor.getCor();
    }
}
