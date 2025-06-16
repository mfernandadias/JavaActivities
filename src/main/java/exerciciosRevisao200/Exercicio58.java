package exerciciosRevisao200;

import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args){
        /*
        crie  um programa que leia um números entre 1 a 10.
        Caso o valor seja inválido, continue a entrada até que um número válido seja forncedido

         */
        Scanner scan = new Scanner(System.in);
        int valor;
        int numero;

        do{
            System.out.println("Insira um valor");
            valor = scan.nextInt();

        }while((valor <=  0) || (valor > 10));

        System.out.println("Digite um número entre 1 a 10 ");
        numero = scan.nextInt();
        //ou

        while(numero < 1 || numero > 10){
            System.out.println("Número inválido. Tente novamente");
            System.out.println("Digite um número entre 1 a 10");
            numero = scan.nextInt();
        }

        System.out.println("Valor válido: " + valor);
    }
}
