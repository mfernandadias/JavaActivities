package intermediarioRevisao.interfaceRevisao;

import java.util.function.Predicate;

public class ExemploPredicate {
    public static void main(String[] args){
        /*
        Usada quando você quer testar uma condição e retornar true ou false
        Método funcional: boolean test(T t);
         */
        Predicate<Integer> ehPar = num -> num % 2 == 0;
        System.out.println(ehPar.test(4)); //true
    }
}
