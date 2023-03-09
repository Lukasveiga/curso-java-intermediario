package com.cursojava.intermediario.aula85_100;

import java.util.Random;

public class Aula99 {

    public static void main(String[] args) {

        System.out.println(Math.floor(Math.random()*1000));

        Random rand = new Random();

        for (int i = 0; i <= 99; i++){
            int number = rand.nextInt(100 + 1);
            if (number == 100){
                System.out.println(number);
                break;
            }
        }

    }
}
