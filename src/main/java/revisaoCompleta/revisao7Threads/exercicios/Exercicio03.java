package revisaoCompleta.revisao7Threads.exercicios;

public class Exercicio03 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        /*
        Use Runnable para imprimir números de 1 a 5
         */

    }

}
