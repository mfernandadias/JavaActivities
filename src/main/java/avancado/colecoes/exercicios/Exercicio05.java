package avancado.colecoes.exercicios;

import java.util.*;

public class Exercicio05 {
    public static void main(String[] args){
        /*
        Iterar com for-each em listas e sets
        Exemplos simples e diretos de como iterar for-each em Listas(List)
        e Conjuntos (Set) em Java:
         */
        List<String> frutas = new ArrayList<>();
        frutas.add("Maça");
        frutas.add("Banana");
        frutas.add("Uva");

        for(String fruta : frutas){
            System.out.println("Fruta: " + fruta);
        }
        //Iterador com for-each em um set (HashSet)
        /*
        Lembre-se: Set não garante ordem então os elementos podem ser impressor em qualquer
        orddem
         */
        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        for(Integer numero : numeros){
            System.out.println("Número: " + numero);
        }

        //Iterando em uma lista de objetos persolizados
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Fernanda", 24));
        pessoas.add(new Pessoa("Mareliza", 25));
        pessoas.add(new Pessoa("Jair", 20));
        pessoas.add(new Pessoa("Bela", 5));

        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa.nome + " tem " + pessoa.idade + " idade ");
        }

        //Iterando com for-each em uma LinkedList
        List<String> cidades = new LinkedList<>();
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Curitiba");

        for (String cidade : cidades) {
            System.out.println("Cidade: " + cidade);
        }

        //Iterando com for-each em um TreeSet(ordenado automaticamente)
        /*
        O TreeSet mantém os elementos em ordem alfabética (ou numérica, se forem números)
         */
        Set<String> nomes = new TreeSet<>();
        nomes.add("Carlos");
        nomes.add("Ana");
        nomes.add("Eduardo");
        nomes.add("Beatriz");

        for(String nome : nomes){
            System.out.println(nome);
        }

        System.out.println(" ");
        System.out.println("Exemplo List");
        //Filtrando dentro do for-each (mostrar apenas números pares)
        List<Integer> numerosA = Arrays.asList(5, 8, 13, 22, 41, 60);

        for (Integer numero : numerosA) {
            if (numero % 2 == 0) {
                System.out.println("Par: " + numero);
            }
        }


    }
}
