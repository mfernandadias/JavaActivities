package avancado.colecoes.exercicios;

import java.util.LinkedList;

public class Exercicio02 {
    public static void main(String[] args){
        /*
        usar LinkedList para adicionar no inicio e no fim
         */
        LinkedList<String> frutas = new LinkedList<>();

        frutas.add("Maça");
        frutas.add("Banana");
        frutas.addFirst("Alface");
        frutas.addLast("Cenoura");

        for(String fruta : frutas){
           System.out.println(fruta);
        }
    }
}
