package projetos.reservaDeHospedagem.model;

public abstract class Quarto {

    private Cliente cliente;
    private Integer num;
    private double precoPorNoite;
    private boolean liberado;

    public Quarto(Cliente cliente, boolean liberado, double precoPorNoite, Integer num) {
        this.cliente = cliente;
        this.liberado = liberado;
        this.precoPorNoite = precoPorNoite;
        this.num = num;
    }

    public Quarto(int numero, String tipo, boolean liberado) {
    }

    public abstract String getDescricao();



    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isLiberado() {
        return liberado;
    }

    public void setLiberado(boolean liberado) {
        this.liberado = liberado;
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public void setPrecoPorNoite(double precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
