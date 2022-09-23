package com.cursojava.aula64;

// Classes aninhadas: Anonima
public class Anonima {

    public void imprimeTexto() {
        System.out.println("qualquer texto");
    }

    public static void main(String[] args) {

        Anonima a = new Anonima(){

            public void imprimeTexto() {
                System.out.println("qualquer texto que foi escrito");
            }
        };

        a.imprimeTexto();
    }
    
}
