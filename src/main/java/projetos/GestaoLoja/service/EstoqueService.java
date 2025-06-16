package projetos.GestaoLoja.service;

import projetoPrincipal.controleDeEstoque.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class EstoqueService {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    /*public void atualizarProduto(int id, String nome, int estoque, double preco){
        for(Produto p : produtos){
            if(p.getId() == id){
                p.setNome(nome);
                p.setEstoque(estoque);

            }
        }
    } *
     */

}
