package intermediarioRevisao.strings.exercicios;

public class Exercicio05 {
    /*
    substitua todas as letras a por x
     */

    public static void main(String[] args){
        String palavra = "Fernandan Alfredo Givanildo";

        /*
        selecionar frase
        escolher letra
        Trocar para segunda letra
         */

        String novaPalavra = palavra.toLowerCase().replace("a", "x");
        System.out.println(novaPalavra);
    }
}
