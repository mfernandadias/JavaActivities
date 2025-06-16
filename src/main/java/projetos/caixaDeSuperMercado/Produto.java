package projetos.caixaDeSuperMercado;

public class Produto {
    private String nome;
    private int quantidade;
    private double precoUnitario;

    public Produto(String nome, double precoUnitario, int quantidade) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    //pq é getSubTotal?
    public double getSubTotal(){
        return quantidade * precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //armazenar os dados produto

    //calcular o subtotal

    //disponibilizar os dados do produto para outras classes


}
