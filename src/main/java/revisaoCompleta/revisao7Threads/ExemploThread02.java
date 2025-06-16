package revisaoCompleta.revisao7Threads;

public class ExemploThread02 extends Thread{
    private String mensagem;

    public ExemploThread02(String mensagem) {
        this.mensagem = mensagem;
    }

    /*public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(mensagem + " - " + i);
        }
    } */
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(mensagem + " - " + i);
            try {
                Thread.sleep(100); // 100 milissegundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        ExemploThread02 thread01 = new ExemploThread02("Maria Fernanda");
        ExemploThread02 thread02 = new ExemploThread02("Mareliza");
        //ExemploThread02 thread3 = new ExemploThread02("Claúdio");

        thread01.start();
        thread02.start();
        //thread3.start();

    }
}
