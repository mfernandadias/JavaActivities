package revisaoCompleta.revisao2POO.exercicios;

public class Professor extends Pessoa{

    double salario;
    public Professor(String nome, String idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }
}
