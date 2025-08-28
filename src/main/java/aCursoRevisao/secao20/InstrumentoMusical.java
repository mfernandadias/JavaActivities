package aCursoRevisao.secao20;

abstract  class InstrumentoMusical {

    protected String nome;

    public InstrumentoMusical(String nome) {
        this.nome = nome;
    }

    //concreto: pode ser herdado
    public void exibirDetalhes(){
        System.out.println("Instrumento: " + nome);
    }
}
