package revisaoCompleta.revisao6Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExemploFormatter {
    public static void main(String[] args){
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String formatado = agora.format(formato);
        System.out.println("Data formatada: " + formatado);
    }
}
