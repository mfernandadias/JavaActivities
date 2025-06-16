package avancado.colecoes.exercicios;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args){
        Queue<String> fila = new LinkedList<>();

        fila.add("Cliente 1");
        fila.add("Cliente 2");
        fila.add("Cliente 3");
        fila.add("Cliente 4");

        System.out.println("Fila: " + fila);

        // Remover o primeiro da fila
        String atendido = fila.poll();
        System.out.println("Atendido: " + atendido);
        System.out.println("Fila após atendimento: " + fila);
    }
}
