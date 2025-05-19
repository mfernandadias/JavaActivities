package beginner;

public class Activity01 {
    /*
    Converter um valor double em int e outro valor int em double
    Exiba os resultados das conversões e explique a diferença entre conversão explicita
    e implicita
     */
    public static void main(String[] args){
        double a = 10;
        double numDouble = a; //conversão automática de int para double

        double valor = (int) a; //perda de precisão
        System.out.println(valor);

        double valorSouble = 9.99;
        int valorInt = (int) valorSouble;
        System.out.println(valorInt); //conversão implicita de int para double


    }
}
