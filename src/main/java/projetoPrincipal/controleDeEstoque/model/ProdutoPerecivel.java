package projetoPrincipal.controleDeEstoque.model;

import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {


    public ProdutoPerecivel(int id, LocalDate dataCadastro, double preco, int quantidade, String nome) {
        super(id, dataCadastro, preco, quantidade, nome);
    }

    @Override
    public String getTipo() {
        return "";
    }
}
