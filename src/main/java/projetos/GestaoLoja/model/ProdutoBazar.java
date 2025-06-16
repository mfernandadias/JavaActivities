package projetos.GestaoLoja.model;

public class ProdutoBazar extends Produto {
    Categoria categoria;

    public ProdutoBazar(int ID, String nome) {
        super(ID, nome);
    }

    public ProdutoBazar(double preco, int quantidade, String nome, int ID) {
        super(preco, quantidade, nome, ID);
    }

    public ProdutoBazar(int ID, double preco, int quantidade, String descricao, String nome) {
        super(ID, preco, quantidade, descricao, nome);
    }
}
