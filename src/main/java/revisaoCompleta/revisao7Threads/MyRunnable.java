package revisaoCompleta.revisao7Threads;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable " + Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
