package com.cursojava.intermediario.aula85_100;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Aula97 {

    public static void main(String[] args) {

        String padrao = "###,###.##";
        DecimalFormat df = new DecimalFormat(padrao);
        System.out.println(df.format(1222555454555.6655));

        DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("en"));
        dfs.setDecimalSeparator(',');
        dfs.setGroupingSeparator('.');

        df = new DecimalFormat(padrao,dfs);
        System.out.println(df.format(1222555454555.6655));
    }
}
