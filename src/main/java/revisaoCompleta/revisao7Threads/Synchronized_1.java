package revisaoCompleta.revisao7Threads;

public class Synchronized_1 {
    public static void main(String[] args){
        MeuRunnable runnable = new MeuRunnable();

        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(runnable);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
