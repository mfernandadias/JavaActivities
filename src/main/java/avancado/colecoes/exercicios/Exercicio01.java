package avancado.colecoes.exercicios;

import java.util.ArrayList;

public class Exercicio01 {
    public static void main(String[] args){
        /*
        criar e adicionar elementos em ArrayList
         */
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Fernanda");
        nomes.add("Mareliza");
        nomes.add("Alex");
        nomes.add("Alfredo");
        nomes.add("Marelizaq");

        //System.out.println(nomes);

        for(String nome : nomes){
            System.out.println(nome);

        }

    }
}
