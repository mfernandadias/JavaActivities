package intermediarioRevisao.strings.exercicios;

public class Exercicio02 {
    /*
    Conte quantas vezes uma letra aparece
     */
    public static int contarLetra(String palavra, char letra) {
        int contador = 0;

        for(int i = 0; i < palavra.length(); i++){
            if(palavra.charAt(i) == letra){
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args){

        String palavra = "banana";
        char letra = 'a';

        int resultado = contarLetra(palavra, letra);
        System.out.println("A letra " + letra + "' aparece " + resultado + " vezes na palavra ");

    }
}
