package intermediarioRevisao.interfaceRevisao;

import java.util.function.Predicate;

public class Exemplo2Predicate {
    public static void main(String[] args){
        Predicate<Integer> maiorDeIdade = idade -> idade >= 18;
        System.out.println(maiorDeIdade.test(20)); //true
    }

    public static class Exercicio02 {
        public static void main(String[]args){
            /*
            Use um Predicate<string> para verificar se o número é negativo
             */
            Predicate<Integer> valorNegativo = valor -> valor < 0;
            System.out.println(valorNegativo.test(-1));
                    /*
                     Predicate<Integer> maiorDeIdade = idade -> idade >= 18;
            System.out.println(maiorDeIdade.test(20)); //true
                     */
        }
    }
}
