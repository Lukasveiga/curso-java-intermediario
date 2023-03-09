package com.cursojava.intermediario.aula71;

public class MyThreadSum implements Runnable{

    private final String name;
    private final int[] nums;
    private static final Calculadora cal = new Calculadora();

    public MyThreadSum(String name, int[] nums) {
        this.name = name;
        this.nums = nums;
        new Thread(this, name).start();
    }


    @Override
    public void run() {

        System.out.println(this.name + " started");

        int soma = cal.somaArray(this.nums);
        System.out.println("Sum result from " + this.name + " thread: " + soma);

        System.out.println(this.name + " finished");

    }
}
