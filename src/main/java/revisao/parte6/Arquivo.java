package revisao.parte6;

import java.io.*;

public class Arquivo {
    public static void main(String[] args){
        /*
        1 - Leitura de arquivos
         */
        String currentDir = System.getProperty("user.dir") + "\\parte6";

        System.out.println(currentDir);
        System.out.println("");

        //windows ->
        //

        /*
        FileREader = caracter pro caracter
        BufferedReader =
         */

        try(FileReader reader = new FileReader(currentDir + "arquivo.txt")){
            int caracter;
            while((caracter = reader.read()) != -1){
                System.out.println((char) caracter);
            }
        }catch(Exception e){
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}
