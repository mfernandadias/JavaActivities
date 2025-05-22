package beginner;

import java.util.Scanner;

public class Activity23 {
    public static void main(String[] args){
        /*
        Desenvolva um programa que leia um número e multiplique esse número por 2
        repetidamente até o valor exceder 1000
         */
        Scanner scan = new Scanner(System.in);
        int valor;
        int multiplicacao;

        do{
            System.out.println("Insira um valor");
            valor = scan.nextInt();
            multiplicacao = 2 * valor;
            System.out.println(multiplicacao);
        }while(multiplicacao  <= 1000);
    }

}
