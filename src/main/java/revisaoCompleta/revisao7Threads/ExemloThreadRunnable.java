package revisaoCompleta.revisao7Threads;

public class ExemloThreadRunnable {
    public static void main(String[] args){
        /*

         */
        MinhaThread thread1 = new MinhaThread();
        thread1.start();

        //usando Runnable
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();
    }
}
