package intermediarioRevisao.interfaceRevisao;

import java.util.function.Function;

public class ExemploFunctionIntermediario {
    public static void main(String[] args){
        Function<String, Integer> converter = Integer::parseInt;

        Integer numero = converter.apply("123");
        System.out.println(numero + 1); //123457


    }
}
