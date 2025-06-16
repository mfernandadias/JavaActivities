package intermediarioRevisao.interfaceRevisao;

import java.util.function.Consumer;

public class ExemploConsumer {
    public static void main(String[] args){
        /*
        Usada quando você quer consumir um valor, ou seja, realizar uma ação sem retornar nada
        Método funcional: void accpet(T t)
         */
        Consumer<String> imprimir = nome -> System.out.println("Olá, " + nome);
        //accept realizar oq ?
        imprimir.accept("João");

    }
}
