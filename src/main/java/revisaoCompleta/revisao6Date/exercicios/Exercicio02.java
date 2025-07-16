package revisaoCompleta.revisao6Date.exercicios;

import java.time.LocalTime;
import java.util.Date;

public class Exercicio02 {
    public static void main(String[] args){
        /*
       Mostrar somente a data atual usando Date
         */

        Date data1 = new Date();

        //System.out.println(data1);

        //exibir somente a hora atual usando LocalTime
        LocalTime hora = LocalTime.now();

        System.out.println(hora);


    }
}
