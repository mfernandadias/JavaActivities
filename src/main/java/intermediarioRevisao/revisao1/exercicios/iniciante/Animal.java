package intermediarioRevisao.revisao1.exercicios.iniciante;

public class Animal {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args){
        Animal gato = new Animal();

        gato.nome = "Blue";

        System.out.println(gato.nome);
    }
}
