package intermediarioRevisao.classesWrappers;

import static java.lang.Integer.parseInt;

public class Exercicio01 {
    public static void main(String[] args){
        /*
        Converte um string para Integer usando parseInt e exiba o dobro do valor
         */
        String valor = "123";
        Integer num = parseInt(valor);



        System.out.println(num * 2 );

        num = new Integer(valor);
        System.out.println(num);
    }
}
