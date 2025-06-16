package revisaoCompleta.revisao3CollectionsEGenerics;

import java.util.TreeMap;

public class Exercicio08 {
    public static void main(String[] args){
        /*
        crie um TreeMap e adicione nomes em ordem aleatória
         */
        TreeMap<String, Integer> cadastro = new TreeMap<>();
        cadastro.put("Fernanda", 50);
        cadastro.put("Marelizada", 40);
        cadastro.put("Maria", 25);

        System.out.println(cadastro);


    }
}
