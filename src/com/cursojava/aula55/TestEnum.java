package com.cursojava.aula55;

import com.cursojava.aula54.DiaSemana;

public class TestEnum {

    public static void main(String[] args) {

        DiaSemana[] dias = DiaSemana.values();

        for (int i = 0; i < dias.length; i++) {
            System.out.printf("%-10s%-20s%n",dias[i], dias[i].getValor());
        }

        System.out.println("-------------- // --------------");

        for (DiaSemana dia: dias) {
            System.out.printf("%-10s%-20s%n", dia, dia.getValor());
        }
        
    }
    
}
