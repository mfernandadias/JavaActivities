package exerciciosRevisao200;

public class Exercicio51 {
    /*
    desenvolva um programa que calcule o fatorial de um número inteiro fornecido
    pelo usuário
     */
    public static void main(String[] args) {
        int valor = 5;
        int fatorial = 1;

        for(int i = 1; i < 5; i++){
            fatorial *= i;
        }

        System.out.println(fatorial);

    }
}
