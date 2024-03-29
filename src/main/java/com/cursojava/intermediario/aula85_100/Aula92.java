package com.cursojava.intermediario.aula85_100;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Aula92 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        TimeZone tz = calendar.getTimeZone();

        System.out.println(tz);

        TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");

        System.out.println(tzSP.getDisplayName());
        System.out.println(tzSP.getID());

        Calendar agora = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
        System.out.println(sdf.format(agora.getTime()));

        Calendar agoraSP = Calendar.getInstance(tzSP);
        System.out.println(sdf.format(agoraSP.getTime()));

    }
}
