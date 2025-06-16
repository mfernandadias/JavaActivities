package avancado.generics;

public class Exercicio11<T> {
    /*
    crie um método genérico que recebe uma lista de números e retorna a média
     public static <T> void imprimirArray(T[] array){
        for(T elemento : array){
            System.out.println(elemento);
        }
    }
     */
    public static <T extends Number> double calcularMedia(T[] array){
        double soma = 0;
        for(T elemento : array){
            soma += elemento.doubleValue(); //converter para double
        }
        return array.length > 0 ? soma / array.length : 0;
    }

    public static void main(String[] args){
        Integer[] numerosInt= {10, 20, 30};
        Double[] numerosDouble = {2.5, 3.5, 4.0};

        System.out.println("Média de inteiros: " + calcularMedia(numerosInt));
        System.out.println("Média de double: " + calcularMedia(numerosDouble));
    }

}
