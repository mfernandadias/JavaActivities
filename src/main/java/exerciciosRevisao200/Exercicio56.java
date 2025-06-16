package exerciciosRevisao200;

public class Exercicio56 {
    public static void main(String[] args){
        /*
        crie um programa que calcule o produto dos números inteiros de 1 a 10
         */

        int produto = 1;

        for(int i = 1; i < 10; i++){
            produto *= i;
        }

        System.out.println(produto);
    }
}
