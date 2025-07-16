package revisaoCompleta.revisao6Date.exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio01 {
    public static void main(String[] args){
        /*
        Mostrar somente a data atual usando LocalDate
         */
        LocalDate data = LocalDate.now();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Data: " + data.format(formato));
    }
}
