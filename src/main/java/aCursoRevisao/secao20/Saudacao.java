package aCursoRevisao.secao20;

public interface Saudacao {
    /*
    Desde o Java 8, interfaces podem ter métodos com implementação
    padrão usando o modificador default
     */
    default void dizerOla(){
        System.out.println("Olá");
    }

    //uma classe pode sobrescrever o método default se quiser
}
