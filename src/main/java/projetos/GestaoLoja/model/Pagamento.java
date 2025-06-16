package projetos.GestaoLoja.model;

import java.time.LocalDate;

abstract class Pagamento {
    private LocalDate data;
    private CategoriaDePagamento categoria;
    private double valor;

    public Pagamento(LocalDate data, double valor, CategoriaDePagamento categoria) {
        this.data = data;
        this.valor = valor;
        this.categoria = categoria;
    }

    public LocalDate getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    public CategoriaDePagamento getCategoria() {
        return categoria;
    }
}
