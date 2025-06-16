package revisaoCompleta.revisao3CollectionsEGenerics;

import java.util.ArrayList;

public class Exercicio06 {
    public static void main(String[] args){
        /*
        percorra um ArrayList com for-each e imprima os valores
         */
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Fernanda");
        nomes.add("Bela");
        nomes.add("Alfredo");
        nomes.add("Jair");

        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
