package com.cursojava.aula57;

public class TestWrapper {

    public static void main(String[] args) {

        /* 
        // Tipos primitivos
        short   num1 = 1;
        byte    num2 = 10;
        int     num3 = 100;
        long    num4 = 10000;
        float   num5 = 3.5f;
        double  num6 = 5.555;
        boolean flag = true;
        char       a = 'a';

        Short   num7 = Short.valueOf((short) 1);
        Byte    num8 = Byte.valueOf((byte) 10);
        Integer num9 = Integer.valueOf(100);
        Long    num10 = Long.valueOf(10000L);
        Float   num11 = Float.valueOf(5.55f);
        */

        Integer num13 = Integer.valueOf("100");

        System.out.println(num13.intValue());
        System.out.println(num13.doubleValue());

        int num16 = Integer.parseInt("10000");

        System.out.println(num16);

        double num17 = Double.parseDouble("3.555");

        System.out.println(num17);
        
    }
    
}
