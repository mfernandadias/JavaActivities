package aCursoRevisao.secao17;

public class ExemploMetodo {
    private String NomeCompleto;

    public ExemploMetodo(String nomeCompleto) {
        NomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto() {
        return NomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        NomeCompleto = nomeCompleto;
    }

    public void exibirInformacoes(){
        System.out.println(getNomeCompleto());
    }
}
