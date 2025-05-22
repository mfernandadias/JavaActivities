package beginner;

public class Activity09 {
    public static void main(String[] args){
        /*
        Escreva um programa que leia três números inteiros e verifique se pelo menos dois deles
        são positivos.
         */

        int num = 10;
        int num2 = -9;
        int valor3 = 11;
        int positivos = 0;


        if (num > 0) positivos++;
        if(num2 > 0) positivos++;
        if(valor3  > 0) positivos++;

        if(positivos > 2){
            System.out.println("Mais de um valor é positivo");
        }
    }
}
