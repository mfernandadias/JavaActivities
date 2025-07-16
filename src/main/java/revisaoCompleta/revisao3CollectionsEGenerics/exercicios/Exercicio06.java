package revisaoCompleta.revisao3CollectionsEGenerics.exercicios;

import java.util.TreeMap;

public class Exercicio06 {
    public class ImprimirTreeMap{

    }
    public static void main(String[] args){
        /*
        Use TreeMap para armazenar produtos e preços.
        Mostre em ordem
         */
        TreeMap<String, Double> produtos = new TreeMap<>();

        produtos.put("Maça", 1.59);
        produtos.put("Alface", 2.20);
        produtos.put("Arroz", 5.15);

        //System.out.println(produtos);

    }
}
