package projetos.reservaDeHospedagem.model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Reserva {
    private Cliente cliente;
    private Quarto quarto;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private double valorTotal;

    public Reserva(Cliente cliente, Quarto quarto, LocalDateTime dataEntrada, LocalDateTime dataSaida) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;


    }

    //oq posso melhorar nessas duas construções
    public Reserva(Cliente cliente, Quarto quarto, Date dataEntrada, Date dataSaida) {
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDateTime dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDateTime getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDateTime dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public double calcularValorTotal() {
        long dias = ChronoUnit.DAYS.between(dataEntrada.toLocalDate(), dataSaida.toLocalDate());

        // Garante pelo menos 1 diária
        if (dias <= 0) {
            dias = 1;
        }

        // Verifica se o horário de saída é após 14h
        if (dataSaida.getHour() >= 14) {
            dias += 1;
        }

        return dias * quarto.getPrecoPorNoite();
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "cliente=" + cliente +
                ", quarto=" + quarto +
                ", dataEntrada=" + dataEntrada +
                ", dataSaida=" + dataSaida +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
