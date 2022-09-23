package com.cursojava.aula71;

public class MinhaThreadSoma implements Runnable{

    private String nome;
    private int[] nums;
    private static Calculadora cal = new Calculadora();

    public MinhaThreadSoma(String nome, int[] nums) {
        this.nome = nome; 
        this.nums = nums;
        new Thread(this, nome).start();  // is the same of "Thread t = new Thread(this) \n t.start();"
    }

    @Override
    public void run() {

        System.out.println(this.nome + " iniciada.");
        
        int soma = cal.somaArray(this.nums);

        System.out.println("Resultado da soma para a thread " + this.nome + " é: " + soma);

        System.out.println(this.nome + " terminada.");
        
    }
    
}
