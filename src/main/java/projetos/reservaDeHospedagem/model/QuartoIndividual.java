package projetos.reservaDeHospedagem.model;

public class QuartoIndividual extends Quarto {
    private boolean possuiCamaExtra;

    public QuartoIndividual(Cliente cliente, boolean liberado, double precoPorNoite, Integer num) {
        super(cliente, liberado, precoPorNoite, num);
    }

    @Override
    public String getDescricao() {
        return "";
    }

    @Override
    public String toString() {
        return "QuartoIndividual{" +
                "possuiCamaExtra=" + possuiCamaExtra +
                '}';
    }
}
