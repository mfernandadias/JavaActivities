package exerciciosRevisao200;

public class Exercicio57 {
    public static void main(String[] args){
        /*
        escreva um programa que some todos os números pares de 1 a 100
        e, separadamente, todos os números ímpares de 1 a 100
         */

        int pares = 0;
        int impares = 0;

        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                pares++;
            }else{
                impares++;
            }
        }

        System.out.println("Pares: "+ pares);
        System.out.println("Impares: " + impares);
    }
}
