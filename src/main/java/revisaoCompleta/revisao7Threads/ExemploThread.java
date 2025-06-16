package revisaoCompleta.revisao7Threads;

public class ExemploThread extends Thread {
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Thread: " + Thread.currentThread().getName() + ": " + i);
            try{
                Thread.sleep(500); //pausa de 500ms
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
