package avancado.colecoes.exercicios;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args){
        List<String> lista = new ArrayList<>();

        lista.add("Banana");
        lista.add("Maça");
        lista.add("Banana"); //aceita duplicidade

        System.out.println("Lista: " + lista);

        System.out.println("Elemento na posição: " + lista.get(1));
    }
}
