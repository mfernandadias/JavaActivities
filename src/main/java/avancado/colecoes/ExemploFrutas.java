package avancado.colecoes;

import java.util.ArrayList;

public class ExemploFrutas {
    public static void main(String[] args){
        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Maça");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Banana"); //permite duplicadas

        System.out.println(frutas); //
        frutas.remove("Banana");
        System.out.println(frutas); //
    }
}
