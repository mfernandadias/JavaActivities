package revisaoCompleta.revisao3CollectionsEGenerics.exercicios;

import java.util.LinkedList;

public class Exercicio03 {
    public static void main(String[] args){
        /*
        crie um LinkedList com números inteiros e remova o primeiro
         */
        LinkedList<Integer> numeros = new LinkedList<>();

        numeros.add(10);
        numeros.add(11);
        numeros.add(12);
        numeros.add(30);


        for(Integer t : numeros){
            System.out.println(t);
        }

        numeros.removeFirst();

        System.out.println();
        for(Integer t : numeros){
            System.out.println(t);
        }


    }
}
