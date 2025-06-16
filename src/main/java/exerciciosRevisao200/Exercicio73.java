package exerciciosRevisao200;

public class Exercicio73 {
    /*
    escreva um programa que crie um array de 5 números inteiros e multiplique todos
    os seus valores por 2, exibindo o novo array no console
     */
    public static void main(String[] args) {
        int[] numbers = {8, 4, 3, 5, 6, 1};

       for(int i = 0; i < numbers.length; i++){
           numbers[i] *= 2;
           System.out.print(numbers[i] + " ");
       }


    }
}
