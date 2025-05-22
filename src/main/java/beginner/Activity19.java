package beginner;
import java.util.Scanner;

public class Activity19 {
    public static void main(String[] args){
        /*
        crie um programa que leia um número inteiro entre 1 a 10
        Caso o valor seja inválido, continue pedindo
         */
        Scanner scan = new Scanner(System.in);
        int num;

        do{
            System.out.print("Insira um valor");
            num = scan.nextInt();
        }while(num < 1 || num > 10);

        System.out.println(num);
    }
}
