package beginner;

public class Activity17 {
    /*
    sequencia de fibonatti
    Escreva um programa que exiba os primeiros 10 termos da seuqência de Fibonacci
     */
    public static void main(String[] args){
        int termo1 = 0, termo2 = 1;
        int proximoTermo = 0;
        for(int i = 3; i <= 10; i++){
            proximoTermo = termo1 + termo2;
            System.out.print(proximoTermo + " ");
            termo1 = termo2;
            termo2 = proximoTermo;
        }

    }
}
