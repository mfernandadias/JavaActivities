package projetos.reservaDeHospedagem.model;

public class QuartoDuplo extends  Quarto {

    private boolean possuiCamaExtra;
    private boolean possuiHidromassagem;

    public QuartoDuplo(Cliente cliente, boolean liberado, double precoPorNoite, Integer num,
                       boolean possuiCamaExtra, boolean possuiHidromassagem) {
        super(cliente, liberado, precoPorNoite, num);
        this.possuiCamaExtra = possuiCamaExtra;
        this.possuiHidromassagem = possuiHidromassagem;
    }

    @Override
    public String getDescricao() {
        return "Quarto Duplo com duas camas, " +
                (possuiCamaExtra ? "com cama extra, " : "sem cama extra, ") +
                (possuiHidromassagem ? "com hidromassagem." : "sem hidromassagem.");
    }

    @Override
    public String toString() {
        return "QuartoDuplo{" +
                "número=" + getNum() +
                ", preço=" + getPrecoPorNoite() +
                ", liberado=" + isLiberado() +
                ", possuiCamaExtra=" + possuiCamaExtra +
                ", possuiHidromassagem=" + possuiHidromassagem +
                '}';
    }


}
