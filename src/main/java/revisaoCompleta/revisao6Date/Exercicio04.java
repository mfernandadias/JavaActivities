package revisaoCompleta.revisao6Date;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exercicio04 {
    public static void main(String[] args){
        /*
        exiba a hora atual no formato: HH:mm:ss
         */
        LocalTime hora = LocalTime.now();
        DateTimeFormatter formatoHora= DateTimeFormatter.ofPattern("HH:mm:ss");

        String horaFormatada = hora.format(formatoHora);
        System.out.println("Hora atua: " + horaFormatada);

    }
}
