package aCursoRevisao.secao14;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class Exercicio01 {
    /*
    crie um programa que receba um array de inteiros do usuário
    e inverta a ordem dos elementos
    Exiba o array original e o array invertido

     */

    public static void inversao(int[] arr){
        int[] arrayInvertido = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            arrayInvertido[i] = arr[arr.length - 1 - i ];
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arrayInvertido[i] + " ");
        }
    }

    public static void main(String[] args){
        int[] tabela = {2, 3, 4, 5, 1, 7};

        inversao(tabela);
    }

}
