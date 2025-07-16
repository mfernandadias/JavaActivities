package exerciciosRevisao200;

import java.util.Scanner;

public class Exercicio84 {
    public static void main(String[] args){
        /*
    Desenvolva um programa que permita ao usuário preencher uma matriz 4x4 com valores inteiros.
    O programa deve pedir ao usuário um número para buscar na matriz e informar em qual posição
    ele foi encontrado (linha e coluna).
         */

        Integer[][] matriz = new Integer[4][4]; //
        Scanner scan = new Scanner(System.in);

        for(int i = 0;  i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("Digite um valor para completar");
                matriz[i][j] = scan.nextInt();
            }
        }

        System.out.println("Digite um valor para ser encontrado na matriz");
        int numero = scan.nextInt();
        boolean encontrado = false;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(matriz[i][j] == numero){
                    System.out.println("Número encontrado na posição [ " + i + " ][ " + " ][ " + j + "]");
                }
            }
        }
    }
}
