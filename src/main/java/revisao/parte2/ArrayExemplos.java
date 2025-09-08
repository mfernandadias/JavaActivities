package revisao.parte2;

public class ArrayExemplos {
    public static void main(String[] args) {

    /*
    São como uma linha de elementos (vetor)
     */
        int[] numeros = new int[5]; //cria um array de 5 posições

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        String[] nomes = {"Maria", "João", "Pedro"};

        int[] numeros2 = {10, 20, 30, 40};

        for(int i = 0; i < numeros2.length; i++){
            System.out.println("Posição " + i + numeros2[i]);
        }

        //Array Multidimencionais
        int[][] matriz = new int[3][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        int[][] matriz2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }
    /*
    🔹 Resumindo
Array unidimensional → lista linear (int[]).
Array multidimensional → tabela ou matriz (int[][]).
Jagged array → matriz com linhas de tamanhos diferentes.
     */
}
