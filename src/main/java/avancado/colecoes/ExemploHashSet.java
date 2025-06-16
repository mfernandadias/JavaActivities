package avancado.colecoes;

import java.util.HashSet;

public class ExemploHashSet {
    public static void main(String[] args){
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Ana"); // duplicata ignorada

        System.out.println(nomes); // [Ana, João] (ordem pode variar)

    }
}
