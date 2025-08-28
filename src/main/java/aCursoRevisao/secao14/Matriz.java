package aCursoRevisao.secao14;

public class Matriz {
    public static void main(String[] args){
        int[][] matriz = {
                {1, 2},
                {3, 5}
        };

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
