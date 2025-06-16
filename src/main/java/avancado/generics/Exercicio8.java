package avancado.generics;

public class Exercicio8<T extends Comparable<T>> {
    /*
    Implemente um método genérico que retorna o maior de dois elementos.
     */
    private T element1;
    private T element2;

    public Exercicio8(T element1, T element2) {
        this.element1 = element1;
        this.element2 = element2;
    }

    public T getElement2() {
        return element2;
    }

    public void setElement2(T element2) {
        //this.element2 = element2;
        if(element2 == null){
            throw new IllegalArgumentException("O valor não pode ser nulo");
        }else {
            this.element2 = element2;
        }
    }

    public T getElement1() {
        return element1;
    }

    public void setElement1(T element1) {
        //this.element1 = element1;
        if(element1 == null){
            throw new IllegalArgumentException("O valor não pode ser nulo");
        }else{
            this.element1 = element1;
        }
    }

    public T obterMaior(){
        return element1.compareTo(element2) >= 0 ? element1 : element2;
    }
}
