package avancado.colecoes.exercicios;

import java.util.LinkedList;
import java.util.Queue;

public class Exercicio11 {
    public static void main(String[] args){
        /* Fila de atendimento bancário
        Simule uma fila de atendimento em um banco.
        Adicione três pessoas. Atende (remove) a primeira da fila e
        mostre quem está sendo atendido e quem ainda está aguardando
         */
        Queue<String> fila = new LinkedList<>();

        fila.add("Fernanda");
        fila.add("Alfredo");
        fila.add("Mareliza");
        fila.add("Jair");

        System.out.println("Fila: " + fila);

        fila.remove();
        System.out.println("Fila: " + fila);

    }
}
