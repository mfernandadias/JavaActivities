package beginner;

public class Activity15 {
    public static void main(String[] args){
        /*
        desenvolva um programa que calcule o fatorial de um número inteiro fornecido
        pelo usuário
        10! = 10 x 9 x 8 x 7 x 6 x 5 x 4 x 3 x 2 x 1
         */
        int num = 10;
        int fatorial = 1;

        for(int i = 1; i <= num; i++ ){
            fatorial *= i;
        }

        System.out.println(fatorial);
    }
}
