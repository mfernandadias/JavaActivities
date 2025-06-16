package exerciciosRevisao200;

public class Exercicio55Fibonacci {
    public static void main(String[] args){
        /*
        Escreva um programa que exiba os primeiros 10 termos da sequência de Fibonatti
         */

        int valor = 0;
        int total = 1;

        for(int i = 1; i <= 10; i++){
            total = i + valor;
            valor = total;
            System.out.print(total + " ");
        }


        /*int termo1 = 0, termo2 = 1;

        for (int i = 3; i <= 10; i++) {
            int proximoTermo = termo1 + termo2;
            System.out.print(proximoTermo + " ");
            termo1 = termo2;
            termo2 = proximoTermo;
        } */
    }
}
