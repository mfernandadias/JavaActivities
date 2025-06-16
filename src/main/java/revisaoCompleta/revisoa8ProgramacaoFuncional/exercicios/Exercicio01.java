package revisaoCompleta.revisoa8ProgramacaoFuncional.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Dobro{
    int calcular(int x);
}
public class Exercicio01 {
    public static void main(String[] args){
        Runnable tarefa = () -> System.out.println("Executando tarefa com lambda!");
        new Thread(tarefa).start();

        //Exercicio 03
        Dobro dobro = x -> x * 2;
        System.out.println(dobro.calcular(10));

        //Exercicio 04
        //Comparator para ordenar uma lista de Strings em ordem alfabética com lambda
        List<String> nomes = Arrays.asList("Carlos", "Ana", "Beatriz", "João");
        nomes.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(nomes); //[Ana, Beatriz, Carlos, João]


        //Exercicio 05
        //Comparactor que ordena lista de interios em ordem decrescente usando lambda
        List<Integer> numeros = Arrays.asList(5, 10, 2, 7, 1);
        numeros.sort((n1, n2) -> n2 - n1);
        System.out.println(numeros); //[10, 7, 5, 4, 3]

        //Exercicio 06
        //comparator que ordena lista de inteiros em ordem decrescente usando lambda
        List<Integer> numerosA = Arrays.asList(5, 10, 4, 3, 2, 3);
        numerosA.sort((n1, n2) -> n2 - n1);
        System.out.println(numeros); //

        //Exercicio 07
        //Função lambda que recebe uma String e retorna seu tamanho

    }
}
