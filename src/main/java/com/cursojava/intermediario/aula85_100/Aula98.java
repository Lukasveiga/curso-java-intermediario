package com.cursojava.intermediario.aula85_100;

import java.math.BigDecimal;

public class Aula98 {

    public static void main(String[] args) {

        // BigDecimal , BigInteger

        double a = 0.03;
        double b = 0.04;
        System.out.println(b - a);

        BigDecimal _a = new BigDecimal("0.03");
        BigDecimal _b = new BigDecimal("0.04");
        System.out.println(_b.subtract(_a));

        BigDecimal bd1 = new BigDecimal("12345678969696.2555");
        BigDecimal bd2 = new BigDecimal("12345678969696.2555");
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.multiply(bd2));

    }
}
