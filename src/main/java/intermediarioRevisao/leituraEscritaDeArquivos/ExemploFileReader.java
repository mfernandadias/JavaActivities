package intermediarioRevisao.leituraEscritaDeArquivos;

import java.io.FileReader;
import java.io.IOException;

public class ExemploFileReader {
    /*
    FileReader é usado para ler arquivos de texto, caractere por carectere. Ele não
    é muito eficiente sozinho por isso geralmente é usado com BufferedReader
     */
    public static void main(String[] args){
        try{
            FileReader leitor = new FileReader("Exemplo.txt");
            int caractere;

            while((caractere = leitor.read()) != -1){
                System.out.println((char) caractere);
            }
            leitor.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
