package revisao.parte2.metodos;

public class Exercicio05 {
    /*
    Crie um método que receba um número e verifique se ele é par ou ímpar (retorne boolean).
     */

    //método que verifica se u número é par
    public static boolean ehPar(int numero){
        return numero % 2 == 0;
    }

    public static void main(String[] args){
        int n1 = 10;
        int n2 = 7;

        System.out.println(n1 + "é par " + ehPar(n1)); //true
        System.out.println(n2 + "é par?" + ehPar(n2)); //false


    }
}
