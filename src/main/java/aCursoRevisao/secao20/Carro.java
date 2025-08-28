package aCursoRevisao.secao20;

public class Carro {
    private String marca;
    private String modelo;
    private Motor motor;

    public Carro(String marca, Motor motor, String modelo) {
        this.marca = marca;
        this.motor = motor;
        //propriedade de objeto composition
        this.modelo = modelo;
    }

}
