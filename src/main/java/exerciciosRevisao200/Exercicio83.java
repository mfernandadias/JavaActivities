package exerciciosRevisao200;

public class Exercicio83 {
    /*
    Matriz Identidade
    Enunciado: Escreva um programa que leia uma matriz 3x3 e exiba a soma dos elementos
    de cada linha e de cada coluna.
     */

    public static void main(String[] args){
        int[][] matriz = new int[4][4];

        //gerando matriz identidade
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == j){
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j] = 0;
                }
            }
        }
        //exibindo a matriz identidade
        System.out.println("Matriz identidade 4x4: ");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
