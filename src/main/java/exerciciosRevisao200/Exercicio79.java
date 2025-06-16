package exerciciosRevisao200;

public class Exercicio79 {
    public static void main(String[] args){
        /* Escreva  um programa que leia 8 números inteiros e verifique se os
        valores estão em ordem crescente. Exiba uma mensagem indicando se os números
        estão ou não em ordem
         */
        int[] numbers = {1, 2, 3, 45, 6, 7};
        boolean emOrdem = true;


       for(int i = 0; i < numbers.length; i++){
           if(numbers[i] > numbers[i + 1]){
               emOrdem = false;
               break;
           }
       }

        if(emOrdem){
            System.out.println("Os números estão em ordem crescente");
        }else{
            System.out.println("Os números NÃO estão em ordem");
        }
    }
}
