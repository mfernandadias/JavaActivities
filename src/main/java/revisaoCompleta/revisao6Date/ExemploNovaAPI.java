package revisaoCompleta.revisao6Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExemploNovaAPI {
    public static void main(String[] args){
       LocalDate data = LocalDate.now();
       LocalTime hora = LocalTime.now();
       LocalDateTime dataHora = LocalDateTime.now();

       System.out.println(data);
       System.out.println(hora);
       System.out.println(dataHora);

    }
}
