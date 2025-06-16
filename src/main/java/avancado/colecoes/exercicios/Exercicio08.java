package avancado.colecoes.exercicios;

import java.util.HashMap;
import java.util.Map;

public class Exercicio08 {
    public static void main(String[] args){
        HashMap<String, Aluno> alunos = new HashMap<>();



        for (Map.Entry<String, Aluno> entry : alunos.entrySet()) {
            String nome = entry.getKey();
            Aluno aluno = entry.getValue();
            double media = aluno.calcularMedia();

            System.out.printf("Aluno: %s | Média: %.2f%n", nome, media);
        }
    }
}
