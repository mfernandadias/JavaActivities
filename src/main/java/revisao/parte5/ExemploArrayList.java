package revisao.parte5;

import java.util.ArrayList;

//import static com.sun.beans.introspect.ClassInfo.clear;

public class ExemploArrayList {
    /*
    É uma coleção dinâmica da Collection Framework do Java
    Diferente de um array normal, que tem tamanho fixo, o ArrayList
    pode crescer e diminuir automaticamente conforme os elementos são adicionados ou removidos.
    Ele só armazena objetos (não tipos primitivos diretamente). Para tipos primitivos, usa-se
    os Wrappers (int → Integer, double → Double, etc).
     */
    public static void main(String[] args){
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("MAria");
        nomes.add("João");
        nomes.add("Ana");

        System.out.println(nomes);

        //principais métodos de ArrayList
        //Adicionar elemntos
        /*
        add(E e)              // adiciona no final
        add(int index, E e)   // adiciona em posição específica
         */

        nomes.add("Carlos");
        nomes.add(1, "Pedro");

        //Acessar elementos
        /*
        get(int index) // retorna o elemento na posição
         */
        System.out.println(nomes.get(0)); // Maria

        //Alterar elementos
        /*
        set(int index, E e); //substitui o valor de uma posição
         */
        nomes.set(2, "Julia"); //muda Ana -> Julia

        //Remover informações
        /*
        remove(int index)    // remove pelo índice
        remove(Object o)     // remove pelo valor
        clear()   */           // remove todos os elementos

        nomes.remove("João"); //remove "Maria"
        nomes.remove(0); //lista fica vazia

        //BUSCAR INFORMAÇÕES
        /*
        contains(Object o)   // verifica se existe
        indexOf(Object o)    // retorna o índice (ou -1 se não achar)
        lastIndexOf(Object o) // última ocorrência
        isEmpty()            // verifica se está vazio
        size()               // retorna o tamanho da lista
         */

        System.out.println(nomes.contains("Ana")); //true
        System.out.println(nomes.indexOf("João")); //1
        System.out.println(nomes.size()); //3

        /*
        CONVERTER PARA ARRAY
        toArray() //transforma em array de Object
        toArray(T[] a) //transforma em array tipado
         */

        String[] array = nomes.toArray(new String[0]);

        /*
        Iterar sobre a lista
         */

        for(String nome : nomes){
            System.out.println(nome);
        }

    }
}
