package com.cursojava.intermediario.aula75_84;

public class Aula76 {

    public static void main(String[] args) {

        String curso = "Curso ";
        String java = "Java";

        String cursoJava = curso + java;
        System.out.println(cursoJava);

        System.out.println(curso.concat(java));

        String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Proin quis libero condimentum, ullamcorper urna quis, sodales risus. " +
                "Curabitur ac faucibus dui. Nulla vel ipsum libero. Aliquam sit amet blandit lacus. " +
                "Pellentesque sagittis vestibulum pretium. Pellentesque ut sollicitudin erat. Aliquam eget dui aliquam, " +
                "congue tellus finibus, congue sapien. Nulla mattis lectus non libero ultricies scelerisque. Morbi egestas urna nunc, " +
                "id hendrerit est feugiat ut. Donec augue risus, condimentum pharetra viverra vel, aliquet vitae velit. Etiam eu pretium dolor. " +
                "Integer nulla urna, volutpat cursus pulvinar non, rhoncus in dolor. Nam ornare blandit fringilla. Curabitur vel ultricies risus. ";

        String concatenacao2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. ";

        System.out.println(concatenacao.hashCode());

        concatenacao2 += "Proin quis libero condimentum, ullamcorper urna quis, sodales risus. ";

        System.out.println(concatenacao2.hashCode());
    }
}
