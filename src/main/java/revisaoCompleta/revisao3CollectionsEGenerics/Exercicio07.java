package revisaoCompleta.revisao3CollectionsEGenerics;

import java.util.ArrayList;

public class Exercicio07 {
    public static void main(String[] args){
        /*
        crie uma função que receba uma lista de inteiros e retorne a soma
         */
        ArrayList<Integer> numeros = new ArrayList<>();
        int soma = 0;

        numeros.add(10);
        numeros.add(11);
        numeros.add(12);
        numeros.add(9);
        numeros.add(13);

        for(Integer num : numeros){
            soma += num;
        }

        System.out.println(soma);
    }
}
