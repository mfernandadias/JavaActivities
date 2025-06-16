package revisaoCompleta.revisao2POO;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void apresentar(){
        System.out.println("Nome: " + nome + ". Idade: " + idade);
    }
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Maria Fernanda", 24);

        pessoa1.apresentar();
    }
}
