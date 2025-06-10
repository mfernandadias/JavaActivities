package avancado.arquivos;

import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivo {
    public static void main(String[] args){
        try {
            FileWriter escritor = new FileWriter("exemplo.txt");
            escritor.write("Olá, mundo!\nEssa é uma escrita simples.");
            escritor.close();
            System.out.println("Arquivo escrito com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
