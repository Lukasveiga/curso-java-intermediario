package com.cursojava.intermediario.aula85_100;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class Aula91 {

    public static void main(String[] args) {

        // DateFormat + Locale
        Date hoje = new Date();
        System.out.println(hoje);

        // pt-BR
        String hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println(Locale.getDefault() + ": " + hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println(Locale.getDefault() + ": " + hojeFormatado);

        // en-US
        Locale.setDefault(new Locale("en", "US"));

        hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println(Locale.getDefault() + ": " + hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println(Locale.getDefault() + ": " + hojeFormatado);

        // ----------------------

        Locale.setDefault(new Locale("pt", "BRT"));

        hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG).format(hoje);
        System.out.println(hojeFormatado);


        try {
            String data = "12/02/2023 14:25";
            Date dataDate = DateFormat.getInstance().parse(data);

            System.out.println(dataDate);
        }
        catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
