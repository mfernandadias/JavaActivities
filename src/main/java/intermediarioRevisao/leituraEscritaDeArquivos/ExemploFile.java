package intermediarioRevisao.leituraEscritaDeArquivos;

import java.io.File;

public class ExemploFile {
    public static void main(String[] args){
        File arquivo = new File("Exemplo.txt");

        if(arquivo.exists()){
            System.out.println("O arquivo existe");
            System.out.println("Caminho: " + arquivo.getAbsolutePath());
            System.out.println("Tamanho: " + arquivo.length() + " bytes");
        }else {
            System.out.println("Arquivo não encontrado");
        }
    }
}
