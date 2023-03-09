package com.cursojava.intermediario.aula53;

import java.util.Arrays;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        usandoConstatntes();
        usandoEnum();

    }

    private static void usandoConstatntes(){

        int segunda = DiasSemanaConstantes.SEGUNDA;
        int terca = DiasSemanaConstantes.TERCA;
        int quarta = DiasSemanaConstantes.QUARTA;
        int quinta = DiasSemanaConstantes.QUINTA;
        int sexta = DiasSemanaConstantes.SEXTA;
        int sabado = DiasSemanaConstantes.SABADO;
        int domingo = DiasSemanaConstantes.DOMINGO;

        System.out.println("Teste utilizando constantes no Java: ");
        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);

    }

    private static void usandoEnum(){

        List<DiaSemana> diasDaSemana = Arrays.asList(
                DiaSemana.SEGUNDA, DiaSemana.TERCA, DiaSemana.QUARTA, DiaSemana.QUINTA,
                DiaSemana.SEXTA, DiaSemana.SABADO, DiaSemana.DOMINGO);

        System.out.println("Teste utilizando enum no Java: ");

        for (DiaSemana dia : diasDaSemana){
            System.out.println(dia);
        }

    }

    private static void imprimeDiaSemana(int dia){
        switch (dia) {
            case 1 -> System.out.println("Segunda-feira");
            case 2 -> System.out.println("Terça-feira");
            case 3 -> System.out.println("Quarta-feira");
            case 4 -> System.out.println("Quinta-feira");
            case 5 -> System.out.println("Sexta-feira");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
        }
    }

}
