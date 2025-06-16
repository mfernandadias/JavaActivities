package projetos.GestaoLoja.model;

abstract class Produto {
    protected int ID;
    protected String nome;
    protected String descricao;
    protected int quantidade;
    protected double preco;


    public Produto(int ID, String nome) {
        this.ID = ID;
        this.nome = nome;
    }

    public Produto(int ID, double preco, int quantidade, String descricao, String nome) {
        this.ID = ID;
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.nome = nome;
    }

    public Produto(double preco, int quantidade, String nome, int ID) {
        this.preco = preco;
        this.quantidade = quantidade;
        this.nome = nome;
        this.ID = ID;
    }

    //metodo para adicinar estoque
    public void adicionarEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    //
    public boolean removerEstoque(int qtd){
        if(quantidade >= qtd){
            quantidade -= qtd;
            return true;
        }
        return false;
    }

    /*
    criar o getters ou setters para os atributos ?
     */

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
