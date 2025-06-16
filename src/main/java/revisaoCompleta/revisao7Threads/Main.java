package revisaoCompleta.revisao7Threads;

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Thread com lambda");
        });
        t.start();
    }
}

/*
Métodos importantes de Thread
start(): Inicia a thread.
run(): Código que será executado na thread.
sleep(ms): Pausa a thread por milissegundos.
join(): Espera uma thread terminar antes de continuar.
isAlive(): Verifica se a thread ainda está em execução.
 */