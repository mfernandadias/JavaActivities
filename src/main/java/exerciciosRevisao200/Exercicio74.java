package exerciciosRevisao200;

public class Exercicio74 {
    public static void main(String[] args){
        /*
        crie um programa que leia 10 números e exiba apenas os valores que estão em
        posições ímpares no array
         */
        int[] valores = {2, 3, 4, 5, 6, 7, 8, 9, 1};

        for(Integer valor : valores){
            if(valor % 2 != 0){
                System.out.println(valor);
            }
        }
    }
}
