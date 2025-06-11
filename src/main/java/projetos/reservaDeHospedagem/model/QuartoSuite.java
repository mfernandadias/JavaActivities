package projetos.reservaDeHospedagem.model;

public class QuartoSuite extends Quarto{

    public QuartoSuite(Cliente cliente, boolean liberado, double precoPorNoite, Integer num) {
        super(cliente, liberado, precoPorNoite, num);
    }

    @Override
    public String getDescricao() {
        return "Suíte de luxo com cama king size, hidromassagem, vista para o mar e serviço de quarto 24h.";
    }

    @Override
    public String toString() {
        return "QuartoSuite{" +
                "número=" + getNum() +
                ", preço=" + getPrecoPorNoite() +
                ", liberado=" + isLiberado() +
                '}';
    }
}
