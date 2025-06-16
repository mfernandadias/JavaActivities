package intermediarioRevisao.revisao1.exercicios.iniciante;

public class Aluno {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void  mostratInf(){
        System.out.println("NOem do aluno: " + this.nome);
    }

}
