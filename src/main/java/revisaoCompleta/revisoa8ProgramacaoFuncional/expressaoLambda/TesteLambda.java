package revisaoCompleta.revisoa8ProgramacaoFuncional.expressaoLambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TesteLambda {
   public static void main(String[] args){
       List<String> lista = Arrays.asList("Java", "Python", "C++");

       lista.forEach(new Consumer<String>() {
           @Override
           public void accept(String s) {
               System.out.println(s);
           }
       });
   }
}
