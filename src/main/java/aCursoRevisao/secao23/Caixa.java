package aCursoRevisao.secao23;

public class Caixa<T>{
    private T conteudo;

    public Caixa(T conteudo) {
        this.conteudo = conteudo;
    }

    public T abter(){
        return conteudo;
    }
}
