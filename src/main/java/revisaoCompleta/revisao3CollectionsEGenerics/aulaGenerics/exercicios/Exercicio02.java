package revisaoCompleta.revisao3CollectionsEGenerics.aulaGenerics.exercicios;

public class Exercicio02<T> {
    /*
   Crie um LinkedList com método Generico para imprimir
   crie um método genérico imprimirElemento(T elemento) que recebe qualquer tipo
   e imprime o valor
    */

    private T t;

    public Exercicio02(T elemento) {
        this.t = elemento;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args){
        Exercicio02 teste = new Exercicio02("Maria Fernanda dos Santos Dias");
        Exercicio02 teste02 = new Exercicio02(0);
        Exercicio02 teste03 = new Exercicio02(9);

        /*for(Exercicio02<?> item : lista){
            impr
        }*/
    }
}
