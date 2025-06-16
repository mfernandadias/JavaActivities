package avancado.colecoes.exercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        /*
        Crie uma estrutura para armazenar os nomes de convidados para uma festa.
        Se alguém tentar adicionar o mesmo nome duas vezes,
        ele não deve aparecer duplicado. Ao final, imprima todos os nomes.
         */
        Scanner scan = new Scanner(System.in);
        Set<String> nomes = new HashSet<>();

        nomes.add("Maria");
        nomes.add("Alfredo");
        nomes.add("Jair");
        nomes.add("Fernanda");
        nomes.add("Fernanda");

        System.out.println("Nomes: " + nomes);



    }
}
