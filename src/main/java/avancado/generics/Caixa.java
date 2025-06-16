package avancado.generics;

public class Caixa<T>{
    private T valor;

    public Caixa(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        if (valor == null) {
            throw new IllegalArgumentException("Valor não pode ser nulo.");
        }
        this.valor = valor;
    }
    /*
    programação orientada a objetos (POO), mais especificamente ao conceito de encapsulamento
     */
    /*
    Forma recomendada:
    Caixa<String> c = new Caixa<>();
    c.setValor("Olá");
    System.out.println(c.getValor());
     */
}
