package exerciciosRevisao200;

import java.util.Scanner;

public class MatrizTransposta {
    /*
    Escreva um programa que leia uma matriz 3x3 e exiba a sua matriz transposta (inversão
    das linhas com as colunas)
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] transposta = new int[3][3];


        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.println("Digite o valor da matriz");
                matriz[i][j] = scan.nextInt();
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz transposta 3x3: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }

    }
}
