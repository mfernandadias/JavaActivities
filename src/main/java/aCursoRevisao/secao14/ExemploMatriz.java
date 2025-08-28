package aCursoRevisao.secao14;

public class ExemploMatriz {
    public static void main(String[] args){
        int[][] matriz = {
                {1, 2, 3},
                {2, 3, 4,},
                {4, 5, 6}
        };

        System.out.println(matriz[1][2]);

        //prechendo array de 2d vazio e preenchendo
        int[][] tabela = new int[3][4];

        for(int i = 0; i < tabela.length; i++){
            for(int j = 0; j < tabela.length; j++){
                tabela[i][j] = i * j;
            }
        }


        for(int i = 0; i < tabela.length; i++){
            for(int j = 0; j < tabela.length; j++){
                System.out.print(tabela[i][j] + " ");
            }
            System.out.println(" ");
        }


    }
}
