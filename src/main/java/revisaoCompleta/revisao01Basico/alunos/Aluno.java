package revisaoCompleta.revisao01Basico.alunos;

public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;

    public Aluno(String nome, String matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public static double calcularMedia(double nota1, double nota2){
        double resultado = (nota1  + nota2) / 2;
        return resultado;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                '}';
    }
}


/*
Classe Aluno com encapsulamento:
Crie a classe Aluno com atributos privados
nome, nota1, nota2 e métodos get e set. Crie um método para calcular a média.
 */