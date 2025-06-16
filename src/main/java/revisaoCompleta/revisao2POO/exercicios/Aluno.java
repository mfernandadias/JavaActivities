package revisaoCompleta.revisao2POO.exercicios;

public class Aluno extends Pessoa{

    String matricula;


    public Aluno(String nome, String idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
}
