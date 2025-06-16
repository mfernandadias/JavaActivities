package exerciciosRevisao200;

import java.util.Scanner;

public class Exercicio80 {
    public static void main(String[] args){
        /*
        Crie um programa que declare uma matriz 3x3 e permite que o usuário
        insira valores inteiros para preencher essa matriz. Em seguida,
        exiba os valores da matriz no console
         */
        Scanner scan = new Scanner(System.in);
        int[][] valores = new int[3][3];

        for(int i = 0; i < valores.length; i++){
            for(int j = 0; j < valores.length; j++){
                System.out.print("Insira um valor" + " ");
                valores[i][j]= scan.nextInt();
            }
        }

        for(int i = 0; i < valores.length; i++){
            for(int j = 0; j < valores.length; j++){
                System.out.print(valores[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
