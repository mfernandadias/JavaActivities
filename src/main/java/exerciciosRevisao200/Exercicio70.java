package exerciciosRevisao200;

public class Exercicio70 {
    public static void main(String[] args){
        /*
        Escreva um programa que leia 15 números inteiros e, em seguida, exiba
quantos desses números são positivos e quantos são negativos.
         */
        int[] numbers = {8, 9, 4, -50, 3, 8, 2, 3, 1, 2, 3, 4, 5, 6, 6, 7, 9};
        int positivo = 0, negativo = 0;

        for(Integer num : numbers){
            if(num < 0){
                negativo++;
            }else {
                positivo++;
            }
        }

        System.out.println("Positivo: " + positivo);
        System.out.println("Negativo: " + negativo);
    }
}
