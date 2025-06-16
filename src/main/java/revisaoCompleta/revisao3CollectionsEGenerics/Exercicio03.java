package revisaoCompleta.revisao3CollectionsEGenerics;

import java.util.HashSet;

public class Exercicio03 {
    public static void main(String[] args){
        /*
        Crie um HashSet e adicione valores repetidos; observe o que acontece.
         */
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(9);
        numeros.add(10);
        numeros.add(9);

        System.out.println(numeros);
    }
}
