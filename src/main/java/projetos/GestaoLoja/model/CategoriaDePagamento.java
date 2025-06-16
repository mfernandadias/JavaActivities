package projetos.GestaoLoja.model;

public enum CategoriaDePagamento {
    BOLETO_LOJA("Boleto da loja", true),
    COMIDA_PADARIA("Padaria", true),
    COMIDA_ALMOCO("Almoço", true),
    COMIDA_MERCADO("Mercado", true),
    FUNCIONARIO("Pagamento de funcionario", true),
    GASTO_PESSOAL("Gasto Pessoa - Salario Mareliza", true),
    MANUTENSAO_ESTRUTURA("Obra", true);

    private final String descricao;
    private final boolean essencial;


    CategoriaDePagamento(String descricao, boolean essencial) {
        this.descricao = descricao;
        this.essencial = essencial;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isEssencial() {
        return essencial;
    }
}
