package beginner;

import java.util.Scanner;

public class Activity22 {
    public static void main(String[] args){
        /*
        Crie um programa que leia um número inteiro positivo e encontre a raiz
        quadrada aproximada desse número. Continue a tentativa até encontrar a
        aproximação correta.
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor");
        int num = scan.nextInt();

        int raizAprox = 0;
        while (raizAprox * raizAprox < num) {
            raizAprox++;
        }
        if (raizAprox * raizAprox == num) {
            System.out.println("Raiz quadrada exata de " + num + " é: + raizAprox");
        } else {
            System.out.println("Raiz quadrada aproximada de " + num +
                    " é: " + raizAprox);
        }

    }
}
