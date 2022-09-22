package com.cursojava.aula58;

public class TestAutoboxing {

    public static void main(String[] args) {

        // Tipo primitivo --> objeto
        /* 
        //autoboxing
        Short num1 = 1;
        Integer num2 = 100;
        Long num3 = 10000L;
        Float num4 = 3.55f;
        */

        // auto un-boxing
        Integer num2 = 100;
        
        int num5 = num2;  // equal to num2.valueOf();

        // auto un-boxing num5 --> autoboxing num5/num2 --> num6
        Integer num6 = num5/num2;

        num6++;
        
        System.out.println(num6);
    }
    
}
