package intermediarioRevisao.strings.exercicios;

public class exercicio01 {

    /*
    Verifque se uma string é palíndromo
     */
    public static void main(String[] args){
        String nome = "Ovo";

        if(nome.isEmpty()){
            System.out.println(" A string esta vazia");
        }

        //cria a string invertida
        StringBuilder stringBuilder= new StringBuilder(nome);
        String invertida = stringBuilder.reverse().toString();


        //comparando a palavra com a palavra invertida
        System.out.println(nome.toLowerCase().equals(invertida.toLowerCase()));

    }
}

/*
public static boolean ehPalindromo(String palavra) {
        // Remove espaços e converte para minúsculas (opcional, mas útil para comparações)
        palavra = palavra.replaceAll("\\s", "").toLowerCase();

        // Verifica se a palavra é vazia
        if (palavra.isEmpty()) {
            return true; // Uma string vazia é considerada um palíndromo
        }

        // Cria a string invertida
        StringBuilder stringBuilder = new StringBuilder(palavra);
        String palavraInvertida = stringBuilder.reverse().toString();

        // Compara a palavra com a palavra invertida
        return palavra.equals(palavraInvertida);
 */