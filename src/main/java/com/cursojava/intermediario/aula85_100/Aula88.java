package com.cursojava.intermediario.aula85_100;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88 {

    public static void main(String[] args) {

        // Gregorian Calendar

        Calendar hoje = Calendar.getInstance();

        GregorianCalendar hoje2 = new GregorianCalendar();

        showDateTime(hoje);
        showDateTime(hoje2);

        System.out.println(hoje2.isLeapYear(2023)); // this method is available only in the GregorianCalendar class.

        GregorianCalendar hoje3 = new GregorianCalendar(2017, Calendar.JANUARY, 1, 12,0,5);
        showDateTime(hoje3);

    }
    private static void showDateTime(Calendar hoje) {

        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);

        System.out.printf("%02d/%02d/%d - %02d:%02d:%02d%n", dia, (mes + 1), ano, hora, minutos, segundos);
    }
}
