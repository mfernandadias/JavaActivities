package projetos.cadastroAlunos;

public class Alunos {
    private String nome;
    private int idade;
    private double nota;

    public Alunos(String nome, double nota, int idade) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", nota=" + nota +
                '}';
    }
}
