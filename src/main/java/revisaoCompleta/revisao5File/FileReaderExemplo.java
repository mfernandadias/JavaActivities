package revisaoCompleta.revisao5File;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExemplo {
    public static void main(String[] args) {
        /*

         */
        try (FileReader leitor = new FileReader("meuarquivo.txt")) {
            int caractere;
            while ((caractere = leitor.read()) != -1) {
                System.out.print((char) caractere);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
