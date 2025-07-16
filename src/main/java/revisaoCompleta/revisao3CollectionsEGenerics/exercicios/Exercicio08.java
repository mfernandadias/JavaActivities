package revisaoCompleta.revisao3CollectionsEGenerics.exercicios;

import java.util.LinkedList;

public class Exercicio08 {
    static class ListaDeInteiros{

    }

    /*
    // Classe que vai encapsular as operações com LinkedList
    static class ListaDeInteiros {
        private LinkedList<Integer> lista;

        public ListaDeInteiros() {
            lista = new LinkedList<>();
        }

        // Método para adicionar um número na lista
        public void adicionarNumero(int numero) {
            lista.add(numero);
        }

        // Método para remover o último elemento
        public void removerUltimo() {
            if (!lista.isEmpty()) {
                int removido = lista.removeLast();
                System.out.println("Removido: " + removido);
            } else {
                System.out.println("A lista está vazia.");
            }
        }

        // Método para exibir a lista
        public void exibirLista() {
            System.out.println("Lista atual: " + lista);
        }
    }
    public static void main(String[] args) {
        ListaDeInteiros minhaLista = new ListaDeInteiros();

        // Adicionando 5 inteiros
        minhaLista.adicionarNumero(10);
        minhaLista.adicionarNumero(20);
        minhaLista.adicionarNumero(30);
        minhaLista.adicionarNumero(40);
        minhaLista.adicionarNumero(50);

        // Exibindo antes da remoção
        minhaLista.exibirLista();

        // Removendo o último
        minhaLista.removerUltimo();

        // Exibindo depois da remoção
        minhaLista.exibirLista();
    }
}
     */

    public static void main(String[] args){
        /*
        adicione 5 inteiros a uma linkedList e remova o último
         */
        LinkedList<Integer> numeros = new LinkedList<>();

        numeros.add(9);
        numeros.add(10);
        numeros.add(8);
        numeros.add(9);

        numeros.removeLast();

        for(Integer n : numeros){
            System.out.println(n);
        }

    }
}
