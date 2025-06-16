package exerciciosRevisao200;

public class Exercicio53 {
    public static void main(String[] args){
        /*
        Desenvolva um programa que conte quantos números entre 1 e 100 são
        são múltiplos de 3
         */
        int contagem = 0;

        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                contagem++;
            }
        }

        System.out.println(contagem);
    }
}
