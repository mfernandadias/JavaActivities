package revisaoCompleta.revisao4ExpressoesLambdas;

import java.util.Arrays;
import java.util.List;

public class LambdaLista {
    public static void main(String[] args){
        /*

         */
        List<String> nomes = Arrays.asList("Ana", "João", "Carlos");
        nomes.forEach(nome -> System.out.println("OLá: " + nome ));
    }
}
