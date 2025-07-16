package revisaoCompleta.revisao7Threads;

public class MinhaThread extends Thread {
    public void rubn(){
        System.out.println("Executando na thread: " + Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        MinhaThread t = new MinhaThread();
        t.start();
    }
}

