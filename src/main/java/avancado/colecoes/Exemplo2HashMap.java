package avancado.colecoes;

import java.util.HashMap;
import java.util.Hashtable;

public class Exemplo2HashMap {
    public static void main(String[] args){
        /*

         */
        HashMap<String, Integer> estoque = new HashMap<>();
        estoque.put("Maç", 50); //
        estoque.put("Banana", 30);
        estoque.put("Maça", 70);  //sobrescreve valor

        System.out.println(estoque.get("Maça")); //70
        System.out.println(estoque); //{Banana=30, Maçã=70}
    }
}
