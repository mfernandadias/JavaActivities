package exerciciosRevisao200;

public class Exercicio72 {
    public static void main(String[] args){
        /*
        Desenvolva um programa que leia 10 números inteiros e armazene-os em um array.
        O programa deve pedir ao usuário para inserir um número extra e contar quantas vezes esse número
        aparece no array
         */
        Integer[] numbers = {2, 3, 4, 2, 6, 2, 8, 1};
        int valor = 2;
        int contagem = 0;

        for(Integer num : numbers){
            if(num == valor){
                contagem++;
            }
        }

        System.out.println(contagem);
    }
}
