package intermediarioRevisao.revisao1.exercicios.iniciante;

public class Funcionario {
    /*
    Crie uma classe Funcionario com nome, cargo e salário. Faça três construtores diferentes.
    Implemente sobrecarga de método aumentarSalario() com 1 e 2 parâmetros.
     */
    private String nome;
    private Double salario;
    private String cargo;

    public Funcionario(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
