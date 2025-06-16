package revisaoCompleta.revisao3CollectionsEGenerics;

import java.util.HashMap;
import java.util.Map;

public class Exercicio04 {
    /*
    Crie um HashMap<String, Integer> com 3 pares nome-nota.
     */
    public static void main(String[] args){
        HashMap<String, Integer> alunos = new HashMap<>();
        alunos.put("Fernanda", 10);
        alunos.put("Alfredo", 8);
        alunos.put("Bela", 6);
        alunos.put("Jeferson", 9);

        for (Map.Entry<String, Integer> entry : alunos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
