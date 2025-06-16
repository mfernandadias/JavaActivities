package avancado.colecoes.exercicios;

import java.util.HashMap;
import java.util.Map;

public class Exercicio04 {
    public static void main(String[] args){
        HashMap<String, Integer> cadastros = new HashMap<>();

        cadastros.put("Fernanda", 24);
        cadastros.put("MAreliza", 50);
        cadastros.put("Alfredo", 13);
        cadastros.put("Jair", 15);
        cadastros.put("Fernanda", 24);

       for(Map.Entry<String, Integer> cadastro : cadastros.entrySet()){
           String nome = cadastro.getKey();
           Integer idade = cadastro.getValue();
           System.out.println("Nome: " + nome + ", Idade: "  + idade);

       }
    }
}
