package intermediarioRevisao.classesWrappers;

import static java.lang.Integer.parseInt;

public class Exercicio06 {
    public static void main(String[] args){
        /*
        leia dois valores String, converta-os para Integer, compare com compareTo e
        diga qual é maior
         */
        String exemplo1 = "12";
        String exemplo2 = "12";
        Integer valor1 = parseInt(exemplo1);
        Integer valor2 = parseInt(exemplo2);

        System.out.println(valor1.compareTo(valor2));


    }
}
