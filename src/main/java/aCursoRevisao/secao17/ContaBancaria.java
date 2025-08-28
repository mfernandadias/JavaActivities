package aCursoRevisao.secao17;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        //lógica para valodar ou manipular

        this.titular = titular;
    }
}
