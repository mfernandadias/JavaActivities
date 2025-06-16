package exerciciosRevisao200;

import java.util.Scanner;

public class Exercicio59 {
    public static void main(String[] args){
        /*
        Desenvolva um programa que lei npumeros inteiros do usuário e exiba a soma
        acumulada. O programa deve terminar quando o usuário digitar o número zero
         */
        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;

        do{
            System.out.println("Digite um valor");
            numero = scan.nextInt();
            soma += numero;
        }while(numero != 0);

        System.out.println(soma);

    }
}
