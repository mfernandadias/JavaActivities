package exerciciosRevisao200;

import java.util.Scanner;

public class Exercicio63a {
    public static void main(String[]args){
        /*
        escreva um programa que peça ao usuário digita uma senha.
        Continue pedindo a senha até que a senha correta digitada
         */
        String senha = "maria1234";
        String confirmacao;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Confirme sua senha");
            confirmacao = scan.nextLine();
        }while(!senha.equals(confirmacao));


        //System.out.println(confirmacao);
        System.out.println("Senha correta");
    }
}
