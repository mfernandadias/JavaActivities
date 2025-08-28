package exerciciosRevisao200;

import java.util.Scanner;

public class Exercicio88 {
    /*
    escreva um programa que leia duas matrizes 3x3 e calcule a soma entre elas,
    exibindo a matriz resultante
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];

        //preenchendo a matriz A
        System.out.println("Preenchendo a matriz A");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Digite o valor para a posição[ " + i + "][" + j + "]:" );
                matrizA [i][j] = scan.nextInt();
            }
        }

        //preenchendo a matriz B
        System.out.println("Preenchendo a matriz B");

    }
}
