package intermediarioRevisao.strings.exercicios;

public class Exercicio03 {
    public static void main(String[]  args){
        /*
        Inverta uma String
         */
        String nome = "fernanda";


        StringBuilder stringBuilder= new StringBuilder(nome);
        String invertida = stringBuilder.reverse().toString();

        System.out.println(invertida);


    }
}
