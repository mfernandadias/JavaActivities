package intermediarioRevisao.interfaceRevisao;

import java.util.function.Function;

public class ExemploFunction {
    public static void main(String[] args){
        /*
        Usada quando vocÊ quer transformar um valor do tipo T em um tipo R
        Método funcional: R apply (T t)
         */
        Function<String, Integer> tamanho = texto -> texto.length();
        System.out.println(tamanho.apply("Java"));
    }
}
