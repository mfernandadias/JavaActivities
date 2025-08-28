package exerciciosRevisao200;

public class Exercicio85 {
    /*
    Escreva um programa que leia uma matriz 3x3 e exiba a sua
    trnasporta (inversão das linhas com as colunas)
     */
    public static void main(String[] args){
        int[][] exemplo = {
                {1, 2},
                {3, 4}
        };

        for(int i = 0; i < exemplo.length; i++){
            for(int j = 0; j < exemplo.length; j++){
                System.out.print(exemplo[i][j] + " ");
            }

            System.out.println();
        }
    }
}
