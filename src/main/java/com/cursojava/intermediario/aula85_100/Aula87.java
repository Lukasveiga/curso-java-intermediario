package com.cursojava.intermediario.aula85_100;

import java.util.Calendar;

public class Aula87 {

    public static void main(String[] args) {

        Calendar hoje = Calendar.getInstance();

        System.out.println(hoje.getTime());

        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);

        System.out.printf("%02d/%02d/%d - %02d:%02d:%02d%n", dia, (mes + 1), ano, hora, minutos, segundos);

    }
}
