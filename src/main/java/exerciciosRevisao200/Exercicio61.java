package exerciciosRevisao200;
import java.util.Scanner;

public class Exercicio61 {
    public static void main(String[] args){
        /*
        Raiz Quadrada Aproximada (While)
        Crie um programa que lei um número positivo e encontre a raiz quadrada aproximada
        desse número. Continue a tentativa até encontrar a aproximação
        correta
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor");
        int numero = scan.nextInt();

        int raizAprox = 0;

       while(raizAprox * raizAprox < numero){
           raizAprox++;
       }
       if(raizAprox * raizAprox == numero){
           System.out.println("Valor exato da raiz é: " + raizAprox);
       } else {
           System.out.println("Valor aproximado " + raizAprox);
       }
        /*
    O programa usa um laço while para incrementar a variável raizAprox até que
    seu quadrado seja igual ou superior ao número fornecido pelo usuário.
    Ele determina a raiz quadrada exata ou uma aproximação.
         */

    }
}
