package revisaoCompleta.revisao5File;

import java.io.File;
import java.io.IOException;

public class FileExemplo {
    public static void main(String[] args) {
        /*
        Para quê serve:
        Usada para manipular arquivos e diretórios no sistema de arquivos: criar, deletar, verificar
        existência, nome, caminho, etc

        Principais métodos:
        exists(), createNewFile(), delete()
        mkdir(), getName(), getAbsolutePath(), length()
         */
        File arquivo = new File("meuarquivo.txt");
        try {
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado.");
            } else {
                System.out.println("Arquivo já existe.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
     }
}
