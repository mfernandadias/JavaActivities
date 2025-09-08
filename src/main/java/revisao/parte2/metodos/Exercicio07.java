package revisao.parte2.metodos;

public class Exercicio07 {
    /*
    crie um método que receba dois números e retorne o maior entre eles
     */
    public static int ehMaior(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args){
        Exercicio07 num = new Exercicio07();

        System.out.println(num.ehMaior(10, 90));
    }
}
