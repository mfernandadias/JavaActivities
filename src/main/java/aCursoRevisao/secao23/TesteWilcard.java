package aCursoRevisao.secao23;

import java.util.Arrays;
import java.util.List;

public class TesteWilcard {
    /*
    Wilcards(?) é usado quando você não sabe exatamente o tipo, mas quer
    permitir mais flexibilidade:
     */
    public static void imprimirLista(List<?> lista){
        for(Object elem : lista){
            System.out.println(lista);
        }
    }

    public static void main(String[] args){
        List<String> nomes = Arrays.asList("Ana","João", "Maria");
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        imprimirLista(nomes);
        imprimirLista(numeros);
    }
}

/*
Resumo
* Generics ajudam a criar código reutilizável e legível
* Permitem trabalhar com coleções de forma tipada
* Usam parâmetros de tipo(T, E, K, V, etc)
Suportam restrições (extends) e wildcards(?)
 */