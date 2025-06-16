package avancado.colecoes.exercicios;

import java.util.HashSet;
import java.util.Set;

public class ExmploSet {
    public static void main(String[] args){
        /*
        Exemplo Set
        * Não aceita duplicidade
         */
        Set<String> frutas = new HashSet<>();

        frutas.add("Banana");
        frutas.add("Maça");
        frutas.add("banana");
        frutas.add("banana"); // não aceita duplicade

        System.out.println("Set: " + frutas);
    }
}
