package aCursoRevisao.secao17;

public class Conta {
    /*
    Modificador	                     Visível onde?
    public	                       Em qualquer lugar
    private	                       Somente dentro da classe
    protected	                   No mesmo pacote ou por herança
   (sem nada) – package-private	   Somente no mesmo pacote
     */
    private double saldo; //só visível dentro da classe

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    /*
    saldo é privada -> só pode ser acessado por métodos da classe
    Depositar((0 e getSaldo() são public -> qualquer classe pode usar

     */
}
