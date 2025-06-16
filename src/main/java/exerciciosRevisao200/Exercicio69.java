package exerciciosRevisao200;

public class Exercicio69 {
    public static void main(String[] args){
        /*
        Desenvolva um programa que leia 10 números inteiros e armazene-os em um array.
        Encontre e exiba o menor e o maior valor presentes no array
         */
        int[] numbers = {1, 4, 5, 6, 2, 54, 76, 8, 2};

        int menor = numbers[0];
        int maior = numbers[0];

        for(Integer valor : numbers){

            if(menor > valor){
                menor = valor;
            }
            if(maior < valor){
                maior = valor;
            }
        }

        System.out.println(menor);
        System.out.println(maior); 
    }
}
