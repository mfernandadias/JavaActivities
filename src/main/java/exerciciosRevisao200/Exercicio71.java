package exerciciosRevisao200;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercicio71 {
    public static void main(String[] args){
        /*
        crie um programa que 6 números inteiros e armazene-os em um array.
        Depois, exiba os valores do array na ordem inversa
         */

        Integer[] numbers = {4, 5, 6, 7, 3, 45, 9};
        // Converter o array para uma List
        List<Integer> lista = Arrays.asList(numbers);

        // Inverter a lista
        Collections.reverse(lista);

        // Imprimir o array invertido
        System.out.println(lista);

        /*
        System.out.println("Números em ordem inversa:");
        for (int i = numeros.length - 1; i >= 0; i--) {
        System.out.println(numeros[i]);
}
         */
    }
}
