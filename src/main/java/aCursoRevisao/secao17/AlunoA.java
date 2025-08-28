package aCursoRevisao.secao17;

public class AlunoA {
    /*
    Você pode usar arrays como atributor de uma classe para armazenar coleções
    de dados (ex: lista de notas, alunos, produtos...)

     */
    private String nome;
    private double[] notas;

    public AlunoA(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public double calcularMedia(){
        double soma = 0;
        for(double nota : notas){
            soma += nota;
        }
        return soma / notas.length;
    }

    public void exibirNotas() {
        System.out.println("Notas de " + nome + ":");
        for (double nota : notas) {
            System.out.println(nota);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
