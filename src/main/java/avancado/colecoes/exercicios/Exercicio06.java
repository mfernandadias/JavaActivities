package avancado.colecoes.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercicio06 {
    public static void main(String[] args){
        /*
        Ordenar uma lista com Collections.sort
         */
        //ArrayList<Integer> numeros = new ArrayList<>();
        List<Integer> numeros = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6);

        Collections.sort(numeros);
        System.out.println(numeros + "/n");

        /*
        Ordenar uma lista de Strings em ordem alfabética
         */
        System.out.println();

        System.out.println("Ordenar uma lista de Strings em ordem alfabética");
        List<String> palavras = Arrays.asList("banana", "abacate", "cereja");
        Collections.sort(palavras);
        System.out.println(palavras); // Saída: [abacate, banana, cereja]

    }
}
