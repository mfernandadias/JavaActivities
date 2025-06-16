package revisaoCompleta.revisao7Threads.exercicios;

public class Exercicio02 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args){

        //criar uma instancia de Runnable
        Runnable tarefa = new Exercicio02();
        Exercicio02 thread = new Exercicio02();

        //thread.start();
    }
}
