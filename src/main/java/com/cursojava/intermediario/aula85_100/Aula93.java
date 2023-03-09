package com.cursojava.intermediario.aula85_100;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Aula93 {

    public static void main(String[] args) {

        //API Data

        //1. Data --> dd-MM-yyyy
        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        System.out.println(LocalDate.of(2023, 3, 7));
        System.out.println(LocalDate.parse("2023-03-07"));

        System.out.println(agora.plusDays(30));
        System.out.println(agora.minus(1, ChronoUnit.DAYS).getDayOfWeek());
        System.out.println(agora.isLeapYear());

        //2. Local Time
        LocalTime hAgora = LocalTime.now();
        System.out.println(hAgora);

        System.out.println(LocalTime.of(20,18));
        System.out.println(LocalTime.parse("20:18"));

        System.out.println(hAgora.plusMinutes(4));

        // Data completa = data + hora
        LocalDateTime agoraCompleto = LocalDateTime.now();
        System.out.println(agoraCompleto);

        System.out.println(agoraCompleto.plusDays(3));

        // Fuso
        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);

        ZoneId fusoSP = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime zdt =  ZonedDateTime.of(LocalDateTime.parse("2023-03-07T22:30:31"), fusoSP);
        System.out.println(zdt);

        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, offset);
        System.out.println(agoraCompleto);
        System.out.println(offsetdt);
    }
}
