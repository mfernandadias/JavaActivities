package revisaoCompleta.revisao9Metodos;

public class Calculadora {

    //metodo 1
    public static int somar(int a, int b){
        return a + b;
    }

    // Método 2 - Sobrecarga com 3 parâmetros
    public static int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Método 3 - Sobrecarga com tipos diferentes
    public static double somar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(somar(2, 3));           // Chama o método 1
        System.out.println(somar(2, 3, 4));        // Chama o método 2
        System.out.println(somar(2.5, 3.5));       // Chama o método 3
    }
}
