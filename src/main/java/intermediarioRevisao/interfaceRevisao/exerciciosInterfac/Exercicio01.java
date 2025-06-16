package intermediarioRevisao.interfaceRevisao.exerciciosInterfac;

import java.util.function.Consumer;

public class Exercicio01 {
    public static void main(String[] args){
        /*
        crie um Consumer<String> que imprima o nnome em letras maiúsculas
           /*
        Usada quando você quer consumir um valor, ou seja, realizar uma ação sem retornar nada
        Método funcional: void accpet(T t)

        Consumer<String> imprimir = nome -> System.out.println("Olá, " + nome);
        //accept realizar oq ?
        imprimir.accept("João");
         */
        Consumer<String> imprimir = nome -> System.out.println(nome.toUpperCase());
        imprimir.accept("Maria");

    }
}
