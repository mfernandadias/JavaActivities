package revisaoCompleta.revisao3CollectionsEGenerics;

import java.util.HashMap;

public class Exercicio05 {
    public static void main(String[] args){
        /*
        Busque e imprima o valor de uma chave no HashMap
         */
        //criação o HashMap
        HashMap<String, String> mapa = new HashMap<>();

        //adicionando pares chave-valor
        mapa.put("nome", "João");
        mapa.put("Fernanda", "Bela");

        //buscar e imprimir o valor da chave "nome"
        String valor = mapa.get("nome");

        //verificando se a chave existe antes de imprimir
        if (valor != null) {
            System.out.println("Valor da chave 'nome': " + valor);
        } else {
            System.out.println("Chave não encontrada.");
        }

    }
}
