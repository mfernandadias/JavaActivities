package revisaoCompleta.revisao7Threads;

public class TesteContador {
    public static void main(String[] args){
        for(int i = 0; i <= 3; i++){
            new Contador(i).start();
        }
    }
}
