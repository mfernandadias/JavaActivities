package revisaoCompleta.revisao3CollectionsEGenerics.aulaGenerics.exercicios;

class Caixa<T>{
    private T t;

    public Caixa(T t) {
        this.t = t;
    }

    public T getValor() {
        return t;
    }

    public void setValor(T t) {
        this.t = t;
    }



public class Exercicio01 {
    public static void main(String[] args) {
        //Caixa caixa = new Caixa<>(30);
        Caixa<Integer> caixa = new Caixa<>(30);
        System.out.println("Valor na caixa: " + caixa.getValor());

       }
    }
}
