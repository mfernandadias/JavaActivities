package exerciciosRevisao200;

public class Exercicio76 {
    public static void main(String[] args){
        /*
        Escreva um programa que leia 10 números inteiros e verifique se algum valor é
          repetido no array. Se houver repetições, exiba uma mensagem informando.

         */

        int[] valor = {2, 3, 4, 5, 2, 3, 4, 5, 6};

        for(int i = 1; i < valor.length; i++){
            if(valor[i] == valor[i-1]){
                System.out.println("Existem valores repetidos no array");
            }
        }
    }
}
