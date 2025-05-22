package beginner;

import java.util.Scanner;

public class Activity10 {
    public static void main(String[] args){
        /*
        desenvolva um programa que leia cinco números inteiros do usuário, um por vez, e
        acumule a soma deles usando o operados de atribuição +=.
        Exiba o totla acumulado ao final
         */
        Scanner scan = new Scanner(System.in);
        int somaAcumulada = 0;
        int valor;

        for(int i = 0; i < 5; i++){
            System.out.println("Digite um valor");
            valor = scan.nextInt();
            somaAcumulada += valor;
        }
        System.out.println("Valor total: " + somaAcumulada); 
    }

}
