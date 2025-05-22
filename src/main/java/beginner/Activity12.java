package beginner;
import java.util.Scanner;

public class Activity12 {
    public static void main(String[] args){
        /*
        escreva um programa que leia um número inteiro e verifique
        se ele é positivo, negativo ou zero.
        Exiba uma mensagem apropriada para cada caso
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = sc.nextInt();

        if (a == b || a == c || b == c) {
            System.out.println("Há números iguais.");
        } else {
            int maior = a;

            if (b > maior) {
                maior = b;
            }

            if (c > maior) {
                maior = c;
            }

            System.out.println("O maior número é: " + maior);
        }

        sc.close();
    }
}
