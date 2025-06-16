package exerciciosRevisao200;

public class Exercicio68 {
    /*
    crie um programa que leia 8 números inteiros
    e exiba todos os valores pares armazenados no array
     */
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4,6, 7, 8};

        for(Integer i : numbers){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

    }
}
