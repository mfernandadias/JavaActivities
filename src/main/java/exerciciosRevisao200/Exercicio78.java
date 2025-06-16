package exerciciosRevisao200;

public class Exercicio78 {
    public static void main(String[] args){
        /*
        desenvolva um programa que crie dois arrays de 5 números inteiros.
        O programa deve comparar os dois e exibir quais posições possuem valores iguais
         */
        int[] numbers1 = {1, 2, 3, 5, 1};
        int[] numbers2 = {1, 2, 4, 5, 7};

        for(int i = 0; i < numbers1.length; i++){
            if(numbers2[i] == numbers1[i]){
                System.out.println("Posição com o meus valor: " + i);
            }
        }
    }
}
