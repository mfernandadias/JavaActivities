package revisaoCompleta.revisao5File.exercicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Exercicio01 {
    public static void main(String[] args){
        /*
        Imprima a data taual usando Date
         */
        String dataTexto = "21/08/2000";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataTexto, formato);
        System.out.println("Data convertida: " + data);


    }
}
