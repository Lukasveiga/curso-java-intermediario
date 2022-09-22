package com.cursojava.aula60;

public class EscopoVariaveis {

    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int calcularValor(int valor) {

        valor = valor + 10;

        return valor;
    }

    public void testeEscopo(){

        for (int i = 0; i < 10; i++){
            if (i< 9) {
                System.out.print(i + " ");
            } else {
                System.out.print(i + "\n");
            }
        }
        
        //i++;  //erro de compilação
        //System.out.println(i);  //erro de compilação

        int j;
        for (j = 0; j < 10; j++) {
            System.out.print(j + " ");
        }

        System.out.println(j);
    }

    public void outroTestEscopo(int num){

        int total = 0;

        try{
            int outroNum = 0;

            total = num/outroNum;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            total++;
            //outroNum++; //erro de compilação
            //e.printStackTrace();  //erro de compilação
        }

        num++;
        //outroNum++; //erro de compilação
        //e.printStackTrace();  //erro de compilação

        System.out.println(total);
    }
}
