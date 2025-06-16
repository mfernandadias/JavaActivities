package revisaoCompleta.revisao7Threads;

public class Threads_1 {
    public static void main(String[] args){
        /* Thread atual
         */
        Thread t = Thread.currentThread();
        System.out.println(t.getName());

        //Nova Thread
        Thread t1 = new Thread(new MyRunnable());
        //
        //t1.run(); //apenas executando na mesma thread
        t1.start();

        //Runable como lambda
        Thread t2 = new Thread(
                () -> System.out.println("Inscreva-se no canal!"));
        t2.start();
    }
}
