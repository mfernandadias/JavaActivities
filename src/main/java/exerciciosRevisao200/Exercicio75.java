package exerciciosRevisao200;

public class Exercicio75 {
    /*
    Desenvolva um programa que crie um array de 10 números inteiros. O
    programa deve pedir ao usuário que forneça dois números: um número para buscar no
    array e outro para substituir o número encontrado. Se o número for encontrado, ele deve ser
    substituído.
     */
    public static void main(String[] args) {
        int[] valor = {2, 3, 4, 5, 6, 1, 2, 3, 4, 6, 9};

        int num = 3, num2 = 9;


        for(Integer i : valor){
            if(num == i){
                i = num2;
            }

            System.out.println(i);
        }


    }
}
