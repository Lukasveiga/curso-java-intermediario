package com.cursojava.aula56;

public class TestDocumento {

    public static void main(String[] args) {

        /*for (TipoDocumento doc: TipoDocumento.values()){
            System.out.println(doc + " - " + doc.geraNumeroTest());
        }
        */

        Pessoa pf = new Pessoa();
        pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTest());
        System.out.println(pf);

        Pessoa pj = new Pessoa();
        pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
        pj.setNumeroDocumento(pj.getTipoDocumento().geraNumeroTest());
        System.out.println(pj);
    }
    
}
