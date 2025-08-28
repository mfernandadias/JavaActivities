package exerciciosRevisao200;
import java.util.Scanner;
import java.util.Random;

public class Exercicio89 {
    public static void main(String[] args){
        /*
        crie um programa que leia uma matriz 5x5 e conte quantos números
        pares existem na matriz. Exiba o total de números pares encontramos
         */
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int pares = 0;

        int[][] numeros = new int[5][5];

        for(int  i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                numeros[i][j] = random.nextInt(100);
                //System.out.println("Insira o valor da matriz");
                //numeros[i][j] = scan.nextInt();
                if(numeros[i][j] % 2 == 0){
                    pares++;
                }
            }
        }



        for(int  i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Quantidade de números pares:  " + pares);

        scan.close();
    }
}
