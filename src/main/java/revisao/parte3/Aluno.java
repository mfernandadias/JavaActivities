package revisao.parte3;

public class Aluno {
    private String nome;
    private double nota1, nota2, nota3;


    public Aluno(String nome, double nota3, double nota2, double nota1) {
        this.nome = nome;
        this.nota3 = nota3;
        this.nota2 = nota2;
        this.nota1 = nota1;
    }
    /*
    Crie a classe Aluno com nota1, nota2 e método media().
    Crie get/set para as notas e encapsule os atributos.
     */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
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
}
