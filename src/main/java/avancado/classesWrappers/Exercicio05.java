package avancado.classesWrappers;

public class Exercicio05 {
    public static void main(String[] args){
        /*
        Verifique se uma String representa um valor booleano usando Boolean.parseBoolean
         */

        String valor = "true";
        boolean num = Boolean.parseBoolean(valor);

        System.out.println(num);

    }
}
