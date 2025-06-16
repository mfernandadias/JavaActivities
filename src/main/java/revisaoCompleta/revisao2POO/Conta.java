package revisaoCompleta.revisao2POO;

public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor) {
        if(valor >= 0 ){
            saldo = valor;
        }
    }
}
