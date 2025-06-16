package avancado.generics;

public class Utilitarios {

    //método genérico para imprimir qualquer array
    public static <T> void imprimirArray(T[] array){
        for(T elemento : array){
            System.out.println(elemento);
        }
    }

    //método principal para testar
    public static void main(String[] args){

        //arrays de diferença tipos
        Integer[] numeros = {1,2,3, 4, 5,6};
        String[] nomes = {"Ana", "Bruno", "Carlos"};
        Double[] notas = {7.5, 8.0, 9.3};

        System.out.println("Array de Números: ");
        imprimirArray(numeros);

        System.out.println("Array de Nomes");
        imprimirArray(nomes);

        System.out.println("Array de notas");

    }
}
