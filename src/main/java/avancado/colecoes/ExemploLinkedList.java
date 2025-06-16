package avancado.colecoes;

import java.util.LinkedList;

public class ExemploLinkedList {
    public static void main(String[] args){
        LinkedList<Integer> numeros = new LinkedList<>();

        numeros.add(10);
        numeros.add(5);
        numeros.add(15);

        System.out.println(numeros); //
        numeros.removeFirst();
        System.out.println(numeros); 

    }
}
