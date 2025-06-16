package exerciciosRevisao200;
import java.util.Scanner;

public class Exercicio66 {
    /*
    desenvolva um programa que leia 5 números inteiros do usuário,
    armazene-os em um array e calcule a soma de todos os elementos.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Insira o valor:");
            numbers[i] = scan.nextInt();
        }

        //exibir os valores inseridos
        System.out.println("Valores inseridos:");
        for (int num : numbers) {
            System.out.println(num);
        }

        scan.close();

    }




}
