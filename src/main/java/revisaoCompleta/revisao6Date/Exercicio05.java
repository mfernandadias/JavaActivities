package revisaoCompleta.revisao6Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio05 {
    public static void main(String[] args){
        /*
        formate a data atual no padrão dd/MM/yyyy
         */

        //obtem a data atual
        LocalDate dataAtual = LocalDate.now();

        //define o formato desejado
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //formata a data
        String dataFormatada = dataAtual.format(formatoBR);

        // Exibe o resultado
        System.out.println("Data formatada: " + dataFormatada);

    }
}
