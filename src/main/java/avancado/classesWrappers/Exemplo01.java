package avancado.classesWrappers;

public class Exemplo01 {
    public static void main(String[] args){
        /*
        O que são as classes wrappers do Java
        Introdução às classes wrappers e sua utilidade
         */
        int numero = 10;
        Integer wrapper = Integer.valueOf(numero); //convertendo int para Integer
        System.out.println(wrapper);

        //criando objetos de classes wrappers
        /*
        Criação usando valueOf() e construtores (embora estes estejam obsoletos para
        aguns wrappers
         */
        Integer a = Integer.valueOf(100);  // Forma recomendada
        Double b = new Double(45.6);       // Ainda funciona, mas não é recomendado
        System.out.println(a + " - " + b);
    }
}
