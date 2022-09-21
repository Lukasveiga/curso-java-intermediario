package com.cursojava.aula54;

public class Formulario {

    enum Genero {
        FEMININO('F'), MASCULINO('M');

        private final char valor;

        public char getValor() {
            return valor;
        }

        Genero(char valor) {
            this.valor = valor;
        }
    }

    private String nome;
    private Genero genero;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    @Override
    public String toString() {
        return "Formulario [genero=" + genero + ", nome=" + nome + "]";
    }

    
    
}
