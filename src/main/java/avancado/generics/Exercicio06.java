package avancado.generics;

public class Exercicio06<T>{
    private T primeiro;
    private T segundo;

    public T getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(T primeiro) {
        this.primeiro = primeiro;
    }

    public T getSegundo() {
        return segundo;
    }

    public void setSegundo(T segundo) {
        this.segundo = segundo;
    }
}
