package exerciciosRevisao200;

import java.util.Scanner;

public class Exercicio64 {
    public static void main(String[] args){
        /*
        Menu de Opções (do-while)
        Crie um programa que exiba um menu de opções
        e permite ao usuário escolher uma ação (como somar dois números,
        subtrair, etc...). O menu deve continuar sendo exibido até o
        usuario escolher a opção de sair
         */
        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                double num1 = scan.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = scan.nextDouble();

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado: " + (num1 / num2));
                        } else {
                            System.out.println("Erro: Divisão por zero não é permitida.");
                        }
                        break;
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println(); // Linha em branco para separar iterações
        } while (opcao != 0);

        System.out.println("Programa encerrado.");
        scan.close();
    }
}
