package aCursoRevisao.secao20;

public class Atleta implements Nadador, Nadador.Corredor {

    @Override
    public void nadar() {
        System.out.println("Nadando.... ");
    }

    @Override
    public void correr() {
        System.out.println("Correndo.... ");
    }


}
