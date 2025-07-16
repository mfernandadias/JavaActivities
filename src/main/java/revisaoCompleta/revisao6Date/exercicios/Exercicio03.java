package revisaoCompleta.revisao6Date.exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio03 {
    public static void main(String[] args){
        /*
        Criar um objeto LocalDate para uma data específica (ex: 25/12/2025)
         */
        //DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.now();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 


    }
}
