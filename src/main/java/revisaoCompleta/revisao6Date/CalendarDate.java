package revisaoCompleta.revisao6Date;

import java.util.Calendar;

public class CalendarDate {
    public static void main(String[] args){
        /*
        Exemplo Calendar
         */
        Calendar calendario = Calendar.getInstance();
        System.out.println("Ano: " + calendario.get(Calendar.YEAR));
        System.out.println("Mês: " + (calendario.get(Calendar.MONTH) + 1)); //JANEIRRO = 0
        System.out.println("Dia: " + calendario.get(Calendar.DAY_OF_MONTH));
    }
}
