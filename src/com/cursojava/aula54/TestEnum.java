package com.cursojava.aula54;

import com.cursojava.aula54.Formulario.Genero;

public class TestEnum {

    public static void main(String[] args) {

        System.out.println("Dias da semana:");
        for (DiaSemana diaSemana: DiaSemana.values()){
            System.out.println(diaSemana + " - " + diaSemana.getValor());
        }

        DiaSemana dia = DiaSemana.SEXTA;

        Data data = new Data(9, 9, 2022, dia);
        System.out.println(data);

        System.out.println("\nCadastro formulário: ");
        Formulario formulario = new Formulario();

        formulario.setNome("Lukas");
        formulario.setGenero(Genero.MASCULINO);

        System.out.println(Genero.MASCULINO.getValor());

        System.out.println(formulario);


        
    }
    
}
