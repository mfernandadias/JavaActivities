package avancado.generics;

public class Exercicio01a<T> {
    /*
    Crie uma classe genérica Caixa<T> com métodos setValor e getValor
     */
    private Double valor;

    public Exercicio01a(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        //this.valor = valor;
        if(valor == null){
            throw new IllegalArgumentException("Valor não pode ser nulo");
        }this.valor = valor;
    }

}
