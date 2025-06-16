package revisaoCompleta.revisao3CollectionsEGenerics;

import java.util.ArrayList;

public class Exercicio01 {
    /*
    Crie um ArrayList<String> e adicione 5 nomes.
     */
    public static void main(String[] args){
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("Fernanda");
        nomes.add("Alfredo");
        nomes.add("Claudio");

        nomes.remove(1);

        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
