package avancado.colecoes;

import java.util.ArrayList;
import java.util.Iterator;

public class ExemploIterador {
    public static void main(String[] args){
        /*
        também permite uso de Iterador para percorrer e remover itens com segurança
         */
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Fernanda");
        nomes.add("João");
        nomes.add("Alfredo");
        nomes.add("Mareliza");

        System.out.println(nomes);


        Iterator<String> it = nomes.iterator();
        while (it.hasNext()) {
            String nome = it.next();
            if (nome.equals("João")) {
                it.remove(); // remover com segurança
            }
        }

        System.out.println(nomes);
    }

}
