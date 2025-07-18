package projetos.reservaDeHospedagem.service;

import projetos.reservaDeHospedagem.configuration.ArquivoUtil;
import projetos.reservaDeHospedagem.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemaReservas {
    private ArrayList<Cliente> clientes;
    private ArrayList<Reserva> reservas;
    private ArrayList<Quarto> quartos;

    public SistemaReservas(ArrayList<Cliente> clientes, ArrayList<Quarto> quartos, ArrayList<Reserva> reservas) {
        this.clientes = clientes;
        this.quartos = quartos;
        this.reservas = reservas;
    }

    public SistemaReservas() {
        this.clientes = new ArrayList<>();
        this.quartos = new ArrayList<>();
        this.reservas = new ArrayList<>();
        inicializarQuartosDisponiveis();
    }

    //public void cadastrarCliente(String nome, String cpf) {
    //}


    public void cadastrarCliente(Cliente c){
        clientes.add(c);
        System.out.println("Cliente cadastrado com sucesso");
    }

    public void adicionarQuarto(Quarto p){
        quartos.add(p);
        System.out.println("Quarto adicionado com sucesso");
    }

    public void realizarReserva(String cpf, int numeroQuarto, Date dataEntrada, Date dataSaida) {
        Cliente cliente = buscarClientePorCpf(cpf);
        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        Quarto quarto = null;
        for (Quarto q : quartos) {
            if (q.getNum() == numeroQuarto && q.isLiberado()) {
                quarto = q;
                break;
            }
        }

        if (quarto == null) {
            System.out.println("Quarto não disponível.");
            return;
        }

        Reserva reserva = new Reserva(cliente, quarto, dataEntrada, dataSaida);
        reservas.add(reserva);
        quarto.setLiberado(false);

        System.out.println("Reserva realizada com sucesso.");
    }

    public void listarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("Nenhuma reserva cadastrada.");
            return;
        }
        for (Reserva r : reservas) {
            System.out.println(r);
        }
    }

    public void listarQuartosDisponiveis() {
        boolean algumDisponivel = false;
        for (Quarto q : quartos) {
            if (q.isLiberado()) {
                System.out.println(q);
                algumDisponivel = true;
            }
        }
        if (!algumDisponivel) {
            System.out.println("Nenhum quarto disponível.");
        }
    }

    public Cliente buscarClientePorCpf(String cpf) {
        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }

    public void salvarDadosEmArquivo() {
        try {
            ArquivoUtil.salvarClientes(clientes);
            ArquivoUtil.salvarQuartos(quartos);
            ArquivoUtil.salvarReservas(reservas);
            System.out.println("Dados salvos com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }

    public void carregarDadosDeArquivo() {
        /*clientes.addAll(ArquivoUtil.carregarClientes());
        quartos.addAll(ArquivoUtil.carregarQuartos());
        reservas.addAll(ArquivoUtil.carregarReservas());
        System.out.println("Dados carregados com sucesso.");*/
        try {
            clientes.addAll(ArquivoUtil.carregarClientes());
            System.out.println("Clientes carregados.");
        } catch (Exception e) {
            System.out.println("Erro ao carregar clientes: " + e.getMessage());
        }

        try {
            quartos.addAll(ArquivoUtil.carregarQuartos());
            System.out.println("Quartos carregados.");
        } catch (Exception e) {
            System.out.println("Erro ao carregar quartos: " + e.getMessage());
        }

        try {
            reservas.addAll(ArquivoUtil.carregarReservas());
            System.out.println("Reservas carregadas.");
        } catch (Exception e) {
            System.out.println("Erro ao carregar reservas: " + e.getMessage());
        }

        System.out.println("Processo de carregamento finalizado.");
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }

    public boolean reservarQuarto(String cpf, int numeroQuarto, String data) {
        return true;
    }


    public void cadastrarQuarto(int numero, String tipo, boolean liberado) {
        for (Quarto q : quartos) {
            if (q.getNum() == numero) {
                System.out.println("Quarto com esse número já está cadastrado.");
                return;
            }
        }

        Quarto novoQuarto = null;

        switch (tipo.toLowerCase()) {
            case "individual":
                novoQuarto = new QuartoIndividual(null, liberado, 120.0, numero);
                break;
            case "duplo":
                novoQuarto = new QuartoDuplo(null, liberado, 200.0, numero, false, false);
                break;
            case "suite":
                novoQuarto = new QuartoSuite(null, liberado, 350.0, numero);
                break;
            default:
                System.out.println("Tipo de quarto inválido.");
                return;
        }

        quartos.add(novoQuarto);
        System.out.println("Quarto cadastrado com sucesso.");
    }

    public void listarClientes(){

        if(clientes.isEmpty()){
            System.out.println("Nenhuma cliente cadastrada");
            return;
        }
        for(Cliente cliente1 : clientes){
            System.out.println(cliente1);
        }

    }

    private void inicializarQuartosDisponiveis() {
        quartos.add(new QuartoIndividual(null, true, 120.0, 101));
        quartos.add(new QuartoDuplo(null, true, 200.0, 102, false, false));
        quartos.add(new QuartoSuite(null, true, 350.0, 103));
    }


}
