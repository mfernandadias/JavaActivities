package revisaoCompleta.revisao7Threads;

public class Exercicio01 extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Olá Mundo");
        }
    }
    public static void main(String[] args){
        /*

         */
        Exercicio01 thread = new Exercicio01();
        thread.start();
    }
}
