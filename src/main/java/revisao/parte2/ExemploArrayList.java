package revisao.parte2;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args){
        //criando um ArrayList de Strings
        ArrayList<String> nomes = new ArrayList<>();

        //adicionando elementos
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Ana");

        //acessando pelo índice
        System.out.println(nomes.get(0)); //Maria

        //alterando valor
        nomes.set(1, "Pedro"); //João -> Pedro

        //removendo valor
        nomes.remove("Ana");

        //tamanho da lista
        System.out.println("Tamanho: " + nomes.size());

        /*
        Métodos principais do ArrayList
        add(Valor) - > adicona elemento
        get(indice) -> acessa elemento
        set(indice, valor) -> altera elemnto
        remove(valor) ou remove(indice) -> remove
        size() -> retorna quantidade de elementos
        contains(valor) -> verifica se existe
        isEmpty() -> verifique se está vazio
         */

        /*
        Resumindo
        for-each → percorre arrays e coleções de forma mais simples, útil quando só precisamos ler os valores.
        ArrayList → versão “turbinada” do array, com tamanho dinâmico e métodos prontos para manipulação.
         */
    }
}
