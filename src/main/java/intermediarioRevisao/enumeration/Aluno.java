package intermediarioRevisao.enumeration;

public class Aluno {
    private String nome;
    private Nota nota;

    public Aluno(String nome, Nota nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}
