package exerciciosRevisao200;

public class Exercicio82 {
    public static void main(String[] args) {
        /*
         Escreva um programa que leia uma matriz 3x3 e exiba a soma dos elementos
         de cada linha e de cada coluna.
         */
        int soma = 0;
        int[][] valores ={
                {1, 2, 4},
                {2, 4, 6},
                {4, 5, 7}
        };
        int[] somaLinhas = new int[3];
        int[] somaColunas = new int[3];


        for(int i = 0; i < valores.length; i++){
            for(int j = 0; j < valores.length; j++){
                soma += valores[i][j];
            }
            System.out.println();
        }

    }
}
