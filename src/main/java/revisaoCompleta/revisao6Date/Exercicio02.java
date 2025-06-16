package revisaoCompleta.revisao6Date;

import java.util.Calendar;

public class Exercicio02 {
    public static void main(String[] args){
        /*
        exiba apenas o ano, mês e dia atuais separadamente
         */
        Calendar calendario = Calendar.getInstance();

        System.out.println("Ano: " + calendario.get(Calendar.YEAR));
        System.out.println("Mês: " + (calendario.get(Calendar.MONTH ) + 1));
        System.out.println("Dia: " + calendario.get(Calendar.DAY_OF_MONTH));
        //System.out.println("Dia: " + calendario.get(Calendar.DAY_OF_MONTH));
        //    }

    }
}
