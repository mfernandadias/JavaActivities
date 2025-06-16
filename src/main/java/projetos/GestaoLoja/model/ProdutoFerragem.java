package projetos.GestaoLoja.model;

public class ProdutoFerragem extends Produto {

    Categoria categoria;

    public ProdutoFerragem(int ID, String nome) {
        super(ID, nome);
    }

    public ProdutoFerragem(double preco, int quantidade, String nome, int ID) {
        super(preco, quantidade, nome, ID);
    }

    public ProdutoFerragem(int ID, double preco, int quantidade, String descricao, String nome) {
        super(ID, preco, quantidade, descricao, nome);
    }

}
