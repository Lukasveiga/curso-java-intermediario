package com.cursojava.intermediario.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89 {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy - HH:mm:ss");

        Calendar data =  new GregorianCalendar(2023, Calendar.MARCH, 6,20,14);

        System.out.println(sdf.format(data.getTime())); // --> SimpleDateFormat.format() method receives an instance of Date class.

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        String minhaData = "29/08/1996";

        try {
            Date minhaDataEmDate = sdf2.parse(minhaData);
            System.out.println(sdf2.format(minhaDataEmDate));
        }
        catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
