package projetos.reservaDeHospedagem.configuration;
import projetos.reservaDeHospedagem.model.Cliente;
import projetos.reservaDeHospedagem.service.SistemaReservas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Menu {
    /*
    Função: Controla a interação com o usuário.

    Métodos:
    mostrarMenuPrincipal()
    cadastrarNovoCliente()
    realizarNovaReserva()
    listarTodasReservas()
    listarQuartosDisponiveis()
     */
    private Scanner scanner = new Scanner(System.in);
    private SistemaReservas sistema = new SistemaReservas(); // Classe fictícia que gerencia dados

    public void mostrarMenuPrincipal() {
        int opcao;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Cadastrar novo cliente");
            System.out.println("2. Realizar nova reserva");
            System.out.println("3. Listar todas as reservas");
            System.out.println("4. Listar quartos disponíveis");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    cadastrarNovoCliente();
                    break;
                case 2:
                    realizarNovaReserva();
                    break;
                case 3:
                    listarTodasReservas();
                    break;
                case 4:
                    listarQuartosDisponiveis();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
    /*
    public void cadastrarCliente(Cliente c){
        clientes.add(c);
        System.out.println("Cliente cadastrado com sucesso");
    }
     */
    public void cadastrarNovoCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        String dataNascStr = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento;

        try {
            dataNascimento = LocalDate.parse(dataNascStr, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("❌ Data inválida. Use o formato dd/MM/yyyy (ex: 21/08/2000).");
            return; // ou: repetir a entrada, dependendo da lógica do seu menu
        }

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Contato: ");
        String contato = scanner.nextLine();

        Cliente cliente = new Cliente(nome, dataNascimento, cpf, contato);
        sistema.cadastrarCliente(cliente); // Usa o método da classe SistemaReservas
    }

    public void realizarNovaReserva() {
        System.out.print("CPF do cliente: ");
        String cpf = scanner.nextLine();
        System.out.print("Número do quarto: ");
        int numeroQuarto = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Data da reserva (dd/mm/aaaa): ");
        String data = scanner.nextLine();
        boolean sucesso = sistema.reservarQuarto(cpf, numeroQuarto, data);
        if (sucesso) {
            System.out.println("Reserva realizada com sucesso.");
        } else {
            System.out.println("Erro ao realizar a reserva.");
        }
    }

    public void listarTodasReservas() {
        sistema.listarReservas();
    }

    public void listarQuartosDisponiveis() {
        sistema.listarQuartosDisponiveis();
    }
}
