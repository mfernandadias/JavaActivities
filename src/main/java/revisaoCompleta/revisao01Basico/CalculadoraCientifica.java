package revisaoCompleta.revisao01Basico;

import java.util.Scanner;

public class CalculadoraCientifica {
    /*
    1. Calculadora Científica com Menu Interativo
       Crie uma calculadora no console com opções: soma, subtração, multiplicação,
       divisão, potência e raiz quadrada. Use Scanner, switch e métodos sobrecarregados.
     */
    public static double soma(double a, double b){
        return a + b;
    }

    public static double subtracao(double a, double b){
        return  a - b;
    }

    public static double multiplicacao(double a, double b){
        return a * b;
    }

    public static double divisao(double a, double b){
        boolean bPositivo = b > 0;
        if(!bPositivo){
            return 0;
        }
        return a / b;
    }

    public static double potencia(double a, double b){
        return Math.pow(a, b);
    }

    public static double raizQuadrada(double a){
        if (a < 0) {
            System.out.println("Erro: não existe raiz real de número negativo!");
            return Double.NaN;
        }
        return Math.sqrt(a);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        CalculadoraCientifica calculadora = new CalculadoraCientifica();
        double a, b;

        int opcao;
        do{
            System.out.println("Soma");
            System.out.println("Subtracao");
            System.out.println("Divisao");
            System.out.println("Multiplicação");
            System.out.println("Potencia");
            System.out.println("Raiz Quadrada");
            System.out.println("Sair");
            opcao = scan.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Digite o valor a");
                    a = scan.nextDouble();
                    System.out.println("Digite o valor b");
                    b = scan.nextDouble();
                    System.out.println(calculadora.soma(a, b));
                    break;
                case 2:
                    System.out.println("Digite o valor a");
                    a = scan.nextDouble();
                    System.out.println("Digite o valor b");
                    b = scan.nextDouble();
                    System.out.println(calculadora.subtracao(a, b));
                    break;
                case 3:
                    System.out.println("Digite o valor a");
                    a = scan.nextDouble();
                    System.out.println("Digite o valor b");
                    b = scan.nextDouble();
                    System.out.println(calculadora.divisao(a, b));
                    break;
                case 4:
                    System.out.println("Digite o valor a");
                    a = scan.nextDouble();
                    System.out.println("Digite o valor b");
                    b = scan.nextDouble();
                    System.out.println(calculadora.multiplicacao(a, b));
                    break;
                case 5:
                    System.out.println("Digite o valor a");
                    a = scan.nextDouble();
                    System.out.println("Digite o valor b");
                    b = scan.nextDouble();
                    System.out.println(calculadora.potencia(a, b));
                    break;
                case 6:
                    System.out.println("Digite o valor a");
                    a = scan.nextDouble();
                    System.out.println(calculadora.raizQuadrada(a));
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente");

            }

        }while(opcao != 0);


    }

}
