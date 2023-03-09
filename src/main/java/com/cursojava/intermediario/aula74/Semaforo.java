package com.cursojava.intermediario.aula74;

public class Semaforo implements Runnable {

    private Cores cor;
    private boolean parar = false;
    private boolean corMudou = false;

    public Semaforo() {
        this.cor = Cores.VERMELHO;
        new Thread(this).start();
    }

    @Override
    public void run() {

        while (!parar) {
            try {
                Thread.sleep(this.cor.getTempoEspera());
                this.mudarCor();
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private synchronized void mudarCor() {
        switch (this.cor) {
            case VERDE    -> this.cor = Cores.AMARELO;
            case VERMELHO -> this.cor = Cores.VERDE;
            case AMARELO  -> this.cor = Cores.VERMELHO;
        }
        this.corMudou = true;
        notify();
    }

    public synchronized void esperarCorMudar() {
        while (!corMudou) {
            try {
                wait();
            }
            catch (InterruptedException e) {
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
