package revisaoCompleta.revisao7Threads;

public class Contador extends Thread {
    private int id;

    public Contador(int id){
        this.id = id;
    }
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Thread: " + id + ": "  + i);
        }
    }
}
