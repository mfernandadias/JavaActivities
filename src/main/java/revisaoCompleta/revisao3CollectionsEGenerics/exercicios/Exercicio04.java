package revisaoCompleta.revisao3CollectionsEGenerics.exercicios;

import java.util.HashSet;

public class Exercicio04 {
    public static void main(String[] args){
        /*
        Crie um HashSet e tente adicionar elementos duplicados. Imprima.
         */
        HashSet<String> nomes = new HashSet<>();

        nomes.add("Fernanda");
        nomes.add("Mareliza");
        //nomes.add("Fernanda");

        for(String n : nomes){
            System.out.println(n);
        }
    }
}
