package avancado.colecoes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExemplosInteracoes {
    public static void main(String[] args){
        /*
        algumas coleções (Set, List) oferecem operacoes  como união, interseção, diferença, etc
         */

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        set1.retainAll(set2); // interseção: set1 agora contém apenas o 3

    }
}
