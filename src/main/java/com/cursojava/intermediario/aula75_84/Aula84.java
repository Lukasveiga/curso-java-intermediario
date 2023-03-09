package com.cursojava.intermediario.aula75_84;

import java.util.StringTokenizer;

public class Aula84 {

    public static void main(String[] args) {

        // Tokenizer

        String info = "1;Antônio;30;";

        StringTokenizer st = new StringTokenizer(info, ";");

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }
}
