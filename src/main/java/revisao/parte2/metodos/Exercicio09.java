package revisao.parte2.metodos;

public class Exercicio09 {
    /*
    Crie um método que receba uma palavra e retorne a quantidade de caracteres.
     */
    public void quantidade(String palavra){
        System.out.println("Quantidade de letras: " + palavra.length());
    }

    public static void main(String[] args){
        Exercicio09 num = new Exercicio09();

        num.quantidade("amor");
    }
}
