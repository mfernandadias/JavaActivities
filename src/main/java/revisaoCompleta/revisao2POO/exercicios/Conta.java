package revisaoCompleta.revisao2POO.exercicios;

public class Conta {
    /*
    Crie  uma classe ContaBancaria com saldo privado.
    Adicione getSaldo() e setSaldo().
    Não permita saldo negativo
     */
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor) {
        if(valor >= 0){
            saldo += valor;
        }
    }
}
