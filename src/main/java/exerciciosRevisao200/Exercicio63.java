package exerciciosRevisao200;

public class Exercicio63 {
    public static void main(String[] args){
        /*
        Desenvolva um programa que leia um número e multiplique esse
        número por 2 repetidamente até o valor exceder 1000
         */

        int valor = 7;
        int resultado = valor;

        while(resultado <= 1000){
            resultado = resultado * 2;

        }

        System.out.println(resultado);
    }
}
