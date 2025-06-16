package projetos.GestaoLoja.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    //private Produto produto;
    private LocalDate data;

    //colocar protected ou private ??? ou deixar público
    protected List<Produto> produto = new ArrayList<>();

    public Venda(LocalDate data, List<Produto> produto) {
        this.data = data;
        this.produto = produto;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    /*
    Método para calcular o valor total da venda (somando os preços).
    (Opcional) Um método para exibir um resumo da venda.
     */

}
