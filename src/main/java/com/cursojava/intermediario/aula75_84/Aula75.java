package com.cursojava.intermediario.aula75_84;

public class Aula75 {

    public static void main(String[] args) {

        //1º
        String vazia = new String();
        System.out.println(vazia);

        //2º
        String java = new String("Java");
        System.out.println(java);

        //3º
        String java1 = new String(java);
        System.out.println(java1);

        //4º
        char[] chars = {'J', 'a', 'v', 'a'};
        String java2 = new String(chars);
        System.out.println(java2);

        char[] abcde = {'A', 'B', 'C', 'D', 'E'};
        String abc = new String(abcde, 0,3);
        System.out.println(abc);

        //5º
        String java3 = "Java";
        String java4 = "Java";
        System.out.println(java3);

        System.out.println(java == java1);
        System.out.println(java3 == java4);

    }
}
