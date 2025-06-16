package revisaoCompleta.revisao3CollectionsEGenerics;

import java.util.Hashtable;

public class Exercicio09 {
    public static void main(String[] args){
        /*
        Crie um Hashtable com 3 pares chave-valor e imprima todos.
         */
        Hashtable<String, Integer> cadastro = new Hashtable<>();

        // Adicionando pares chave-valor
        cadastro.put("João", 25);
        cadastro.put("Maria", 30);
        cadastro.put("Pedro", 28);

        // Imprimindo todos os pares
        for (String chave : cadastro.keySet()) {
            System.out.println("Nome: " + chave + ", Idade: " + cadastro.get(chave));
        }

        /*for(String chave : cadastro.keySet()){
            System.out.println("Nome: " + chave + ", Idade: " + cadastro.get(chave));
        } */
    }
}
