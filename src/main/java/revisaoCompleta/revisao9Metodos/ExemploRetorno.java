package revisaoCompleta.revisao9Metodos;

public class ExemploRetorno {
    public static int somar(int a, int b){
        return a  + b;
    }

    public static void main(String[] args){
        int resultado = somar(3, 5);
        System.out.println("Resultado:  " + resultado);
    }
}
