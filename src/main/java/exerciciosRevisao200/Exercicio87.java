package exerciciosRevisao200;

public class Exercicio87 {
    /*
    Multiplicacoa de Matrizes
    Desenvolva um programa que leia duas matrizes 2x2 e calcule o produto entre elas,
    exibindo o resultado
     */
    public static void matriz(int[][] matrizA, int[][] matrizB){

        int[][] matriz = new int[2][3];

        for(int i = 1; i < 2; i++){
            for(int j = 1; j < 3; j++){
                matriz[i][j] = 0;
                for(int k = 0; k < 2; k++) {
                    matriz[i][j] += matrizA[i][j] * matrizB[i][j];
                }
            }
        }

        for(int i = 1; i < 2; i++){
            for(int j = 1; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }
    }
    public static void main(String[]args){

        int[][] matrizA = {
                {1, 4},
                {3, 5},
                {9, 10}
        };

        int[][] matrizB = {
                {1, 4},
                {10, 8},
                {1, 2}
        };

        matriz(matrizA, matrizB);

    }
}
