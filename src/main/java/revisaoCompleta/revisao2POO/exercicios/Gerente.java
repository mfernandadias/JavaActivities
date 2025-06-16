package revisaoCompleta.revisao2POO.exercicios;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public void bonus(double valor){
        salario += valor;
    }
}
