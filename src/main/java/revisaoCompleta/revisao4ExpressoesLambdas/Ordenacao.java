package revisaoCompleta.revisao4ExpressoesLambdas;

import java.util.Arrays;
import java.util.List;

public class Ordenacao {
    public static void main(String[] args){
        /*
        Operacao com lambda
         */
        List<String> nomes = Arrays.asList("Pedro", "Amanda", "Bruno");
        nomes.sort((a, b) -> a.compareTo(b));
        System.out.println(nomes);

        //oq significa o sort ?
    }
}
