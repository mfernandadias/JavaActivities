package avancado.arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
    public static void main(String[] args){
        try{
            BufferedReader leitor = new BufferedReader(new FileReader("Exemplo.txt"));
            String linha;
            while((linha = leitor.readLine()) != null){
                System.out.println(linha);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
