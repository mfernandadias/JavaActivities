package revisaoCompleta.revisao6Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Exercicio03 {
    public static void main(String[] args){
        /*
        crie uma data qualquer (ex: 01/01/2000) com LocalDate
         */
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current LocalDateTime: " + now);

        LocalDateTime specificDateTime = LocalDateTime.of(2025, Month.DECEMBER, 25, 10, 30, 0);
        System.out.println("Specific LocalDateTime:  " + specificDateTime);

        LocalDateTime futureDateTime = now.plusDays(5);
        System.out.println("LocalDateTime after 5 days: " + futureDateTime);

        System.out.println(" ");
        //criando uma data especifica: 1ª de janeiro de 2000
        LocalDate data = LocalDate.of(2000, 1, 1);
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data criada: " + data);
    }
}
