package revisao.parte9generics;

public class Caixa<T> {
    private T conteudo;

    public Caixa(T conteudo) {
        this.conteudo = conteudo;
    }

    public T obter(){
        return conteudo;
    }
}
