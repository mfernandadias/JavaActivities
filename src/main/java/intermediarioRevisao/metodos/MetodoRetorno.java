package intermediarioRevisao.metodos;

public class MetodoRetorno {

    public int somar(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        /*
        Descrição: Retornam um valor(int, String, etc) com return
         */

        MetodoRetorno a = new MetodoRetorno();

        System.out.println(a.somar(2, 5));
    }
}
