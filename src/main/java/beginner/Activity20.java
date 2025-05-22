package beginner;

import java.util.Scanner;

public class Activity20 {
    public static void main(String[] args){
        /* Desenvolva um programa que leia números inteiros do
        usuário e exiba a soma acumulada. O programa deve terminar quando
        o usuário digitar o número zero.
         */
        Scanner scan = new Scanner(System.in);
        int somaAcumulada = 0;
        int valorDigitado;

        System.out.println("Digite números para somar. Digite 0 para parar");
        System.out.println("Digite um número");
        valorDigitado = scan.nextInt();

        while(valorDigitado != 0){
            somaAcumulada += valorDigitado;
            System.out.print("Digite outro número: ");
            valorDigitado = scan.nextInt();
        }

        System.out.println("Soma total: " + somaAcumulada);
    }
}
