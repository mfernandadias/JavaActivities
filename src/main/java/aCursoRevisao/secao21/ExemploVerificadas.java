package aCursoRevisao.secao21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExemploVerificadas {
    /*
    📌 Explicação:
       FileNotFoundException é verificada (checked): exige tratamento com try-catch ou throws.
       ArithmeticException é não-verificada (unchecked): pode ou não ser tratada.
     */
    public static void main(String[] args){
        try{
            FileReader arquivo = new FileReader("arquivo.txt"); //exeução verificada

        }catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }
        int x = 10/ 0;
    }
}
