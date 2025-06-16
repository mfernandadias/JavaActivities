package revisaoCompleta.revisao4ExpressoesLambdas;

public interface Operacao {
    int executar(int a, int b);

    public static void main(String[] args){
        /*

         */
        Operacao soma = (a, b) -> a + b;
        System.out.println("Resultado: " + soma.executar(5, 3));
    }
}
