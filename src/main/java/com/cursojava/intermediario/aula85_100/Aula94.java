package com.cursojava.intermediario.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Aula94 {

    public static void main(String[] args) {


        try {
            diferencaDataAteJava7();
        }
        catch (ParseException e) {
            throw new RuntimeException(e);
        }

        diferencaDataAteJava8();
        diferencaDataAteJava8ComTempo();
    }

    private static void diferencaDataAteJava7() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date primeiraDt = sdf.parse("01/01/2023");
        Date segundaDt = sdf.parse("01/02/2023");

        long diffEmMill = Math.abs(segundaDt.getTime() - primeiraDt.getTime());
        long diff = TimeUnit.DAYS.convert(diffEmMill, TimeUnit.MILLISECONDS);

        System.out.println("Diferença em dias: " + diff);

    }

    private static void diferencaDataAteJava8() {

        LocalDate data1 = LocalDate.of(2023,1,1);
        LocalDate data2 = LocalDate.of(2023,2,1);

        Period periodo = Period.between(data1,data2);

        int dias = periodo.getDays();
        int meses = periodo.getMonths();

        System.out.printf("Dias: %d%nMeses: %d%n", dias, meses);

    }

    private static void diferencaDataAteJava8ComTempo(){
        LocalDateTime data1 = LocalDateTime.of(2023, 1, 1, 20, 30);
        LocalDateTime data2 = LocalDateTime.of(2023, 1, 1, 22, 30);

        Duration duracao = Duration.between(data1, data2);
        long diff = duracao.toHours();

        System.out.println(diff);

    }
}
