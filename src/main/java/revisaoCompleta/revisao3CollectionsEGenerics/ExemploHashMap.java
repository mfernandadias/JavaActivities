package revisaoCompleta.revisao3CollectionsEGenerics;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args){
        HashMap<String, Integer> notas = new HashMap<>();
        notas.put("Ana", 9);
        System.out.println(notas.get("Ana")); // 9
    }
}


/*
HashMap
Estrutura de chave-valor (Ex: dicionario)
Permite null como chave e valor 
 */