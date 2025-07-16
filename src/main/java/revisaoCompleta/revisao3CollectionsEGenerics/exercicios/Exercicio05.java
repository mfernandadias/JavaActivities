package revisaoCompleta.revisao3CollectionsEGenerics.exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Exercicio05 {
    /*
    Crie um HashMap com nomes e idades. Busque a idade de um nome
     */
    public static void main(String[] args){
        HashMap<String, Integer> cadastro = new HashMap<>();

        cadastro.put("Maria Fernanda", 40);
        cadastro.put("Mareliza", 187);
        cadastro.put("Alfredo", 13);

        Iterator<Map.Entry<String, Integer>> cadastroIterator = cadastro.entrySet().iterator();

        while(cadastroIterator.hasNext()){
            Map.Entry<String, Integer> mapElement = cadastroIterator.next();
            String key = mapElement.getKey();
            Integer value = mapElement.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }


    }
}
/*
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        Iterator<String> iterator = frutas.iterator();

        while (iterator.hasNext()) {
            String fruta = iterator.next();
            System.out.println(fruta);
        }
    }
}
 */