package avancado.colecoes.exercicios;

import java.util.HashMap;
import java.util.HashSet;

public class Exercicio03 {
    public static void main(String[] args){
        /*
        remover duplicadas com HashSet
         */
        HashSet<String> nomes = new HashSet<>();

        nomes.add("Alfredo");
        nomes.add("Fernanda");
        nomes.add("Fernanda");
        nomes.add("Mareliza");

        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
