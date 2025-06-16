package revisaoCompleta.revisao01Basico;

import java.util.Scanner;

public class Texto {

    public static String caracteresValor(String frase){
        //Remover espaços para contar os caracteres "visiveis"
        String fraseSemEspacos = frase.replace("\\s+", "");
        int totalCaracteres = fraseSemEspacos.length();

        //Contar palavras
        String[] palavras = frase.trim().split("\\s+");
        int totalPalavras = palavras.length;

        // Inicializar contadores
        int vogais = 0;
        int consoantes = 0;

        // Percorrer a frase original
        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) >= 0) {
                    vogais++;
                } else {
                    consoantes++;
                }
            }
        }

        // Montar o relatório
        String resultado = "Análise da frase:\n";
        resultado += "Total de caracteres (sem espaços): " + totalCaracteres + "\n";
        resultado += "Total de palavras: " + totalPalavras + "\n";
        resultado += "Quantidade de vogais: " + vogais + "\n";
        resultado += "Quantidade de consoantes: " + consoantes;

        return resultado;
    }


    public static void main(String[] args){
        /*
        Análise de Texto com Estatísticas
        Peça ao usuário uma frase e calcule:
        Número total de caracteres (sem espaços)
        Número de palavras
        Quantidade de vogais e consoantes
        Use String, loops, e if.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scan.nextLine();

        String resultado = caracteresValor(frase);
        System.out.println(resultado);

    }
}
