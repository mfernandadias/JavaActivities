package revisaoCompleta.revisao7Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExemploExecutorService {
    public static void main(String[] args){
        /*
        cria um pool de 2 threads
         */
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submete tarefas para o pool
        for (int i = 0; i < 5; i++) {
            final int tarefaId = i;
            executor.submit(() -> {
                System.out.println("Tarefa " + tarefaId + " executada por " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
