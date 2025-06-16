package projetoPrincipal.controleDeEstoque.model;

import java.time.LocalDate;

public abstract class Produto {
    protected int id;
    protected String nome;
    protected int quantidade;
    protected double preco;
    protected LocalDate dataCadastro;

    public Produto(int id, LocalDate dataCadastro, double preco, int quantidade, String nome) {
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.preco = preco;
        this.quantidade = quantidade;
        this.nome = nome;
    }

    public abstract String getTipo();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
