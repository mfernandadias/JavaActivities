package revisaoCompleta.revisao3CollectionsEGenerics.exercicios;

import java.util.ArrayList;

public class Exercicio02 {
    /*
    Crie um ArrayList com 5 nomes e imprima todos usando for
     */
    public static void main(String[] args){
        ArrayList<String> nome = new ArrayList<>();

        nome.add("Fernanda");
        nome.add("Mareliza");
        nome.add("Alfredo");
        nome.add("Jair");

        for(String n : nome){
            System.out.println(n);
        }
    }
}
