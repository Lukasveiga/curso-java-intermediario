package com.cursojava.intermediario.aula85_100;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Aula96 {

    public static void main(String[] args) {

        // Number Format
        // Brasil 1.000,00
        // EUA 1,000.00

        Locale en = new Locale("en", "US");
        NumberFormat nf = NumberFormat.getInstance(en);

        String num = nf.format(100.99);
        System.out.println(num);

        Locale br = new Locale("pt", "BR");
        nf = NumberFormat.getInstance(br);

        num = nf.format(100.99);
        System.out.println(num);

        // MOEDA
        NumberFormat moeda  = NumberFormat.getCurrencyInstance(Locale.getDefault());

        String valor = moeda.format(100.99);
        System.out.println(valor);

        Currency currency = moeda.getCurrency();
        System.out.println(currency);

        // PORCENTAGEM
        NumberFormat porcent = NumberFormat.getPercentInstance();
        String porcentagem = porcent.format(99.98);
        System.out.println(porcentagem);

        porcent.setMaximumIntegerDigits(4);
        porcent.setMinimumIntegerDigits(3);

        porcent.setMaximumFractionDigits(2);
        porcent.setMinimumFractionDigits(1);

        porcentagem = porcent.format(99.98);
        System.out.println(porcentagem);

        // ARREDONDAMENTO
        nf = NumberFormat.getInstance();

        nf.setRoundingMode(RoundingMode.CEILING);
        System.out.println(nf.format(99.50));



    }
}
