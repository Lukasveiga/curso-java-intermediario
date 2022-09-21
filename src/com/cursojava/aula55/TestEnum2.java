package com.cursojava.aula55;

import com.cursojava.aula54.DiaSemana;

public class TestEnum2 {

    public static void main(String[] args) {

        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

        System.out.println(dia);
        
    }
    
}
