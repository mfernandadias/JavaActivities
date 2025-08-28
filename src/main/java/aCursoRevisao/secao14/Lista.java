package aCursoRevisao.secao14;

import java.util.Arrays;

public class Lista {
    public static void main(String[] args){
        String[] frutas = new String[10];

        frutas[0] = "Maça";
        frutas[1] = "Alface";
        frutas[2] = "Mamão";

        System.out.println(frutas[1]);

        //somar todos os elemntos de um array
        //acessar os elementos e condensar a soma deles em um array


        int[] numeros = {10, 19, 0, 9, 2, 1, 2, 4};

        int soma = 0;

        for(int i = 0; i < numeros.length; i++){

            soma += numeros[i];
        }

        System.out.println(soma);

        /*
        for each
        Nomear o item => Array
        Pessoas => Pessoa
        Frutas => Fruta
         */

        for(String fruta : frutas){
            System.out.println(fruta);
        }

        //encontrar  o maior valor de um array
        int[] valores = {10, 4, 5, 6, 76};

        int j = 0;

        /*(while( j < valores.length){

        } */

        //Concatenar elementos de um array
        String[] palavras = {"Java", "é", "bom"};

        String frase = "";

        //verificar se o valoor esta presente em array


        //4 - loops com if

        //filtar e somar numeros pares
        int somaPares = 0;

        for(int numero : numeros){
            if(numero % 2 == 0){
                somaPares += numero;
            }
        }

        //exibir valores maiores que um determinado valor

        String dadosFrutas = Arrays.toString(frutas);

        int[] teste = new int[3];

        System.out.println(Arrays.toString(teste));

        //ex3: usando ArrayList
        java.util.ArrayList<String> listaFrutas = new java.util.ArrayList<>(Arrays.asList("Maça", "Alface"));



    }
}
