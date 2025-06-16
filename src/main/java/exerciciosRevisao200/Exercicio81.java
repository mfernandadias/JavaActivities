package exerciciosRevisao200;

public class Exercicio81 {
    public static void main(String[] args){
        /*
        desenvolva um programa que leia uma matriz de 3x3 de inteiros
        e calcule a soma de todos os elementos da matriz
         */
        int[][] valores ={
                {1, 2, 4},
                {2, 4, 6},
                {4, 5, 7}
        };

        for(int i = 0; i < valores.length; i++){
            for(int j = 0; j < valores.length; j++){
                System.out.print(valores[i][j] + " ");
            }
            System.out.println();
        }
    }
}
