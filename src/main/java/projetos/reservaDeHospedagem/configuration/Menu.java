package projetos.reservaDeHospedagem.configuration;
import projetos.reservaDeHospedagem.model.Cliente;
import projetos.reservaDeHospedagem.service.SistemaReservas;

//import java.io.FilePermissionCollection;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.InputMismatchException;
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
    Scanner scan = new Scanner(System.in);
    private SistemaReservas sistema = new SistemaReservas(); // Classe fictícia que gerencia dados

    public void mostrarMenuPrincipal() {
        int opcao;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Cadastrar novo cliente");
            System.out.println("2. Realizar nova reserva");
            System.out.println("3. Listar todas as reservas");
            System.out.println("4. Listar quartos disponíveis");
            System.out.println("5. Listar todos os cliente cadastrados");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();
            scan.nextLine(); // Limpar o buffer


            //cadastrarCliente

            switch (opcao) {
                case 1:
                    System.out.println("\n=== Cadastro de Novo Cliente ===");

                    System.out.print("Nome: ");
                    String nome = scan.nextLine();

                    System.out.print("Data de nascimento (formato yyyy-MM-dd): ");
                    String dataStr = scan.nextLine();
                    LocalDate dataNascimento = null;

                    try {
                        dataNascimento = LocalDate.parse(dataStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    } catch (DateTimeParseException e) {
                        System.out.println("Data inválida! Cliente não cadastrado.");
                        return;
                    }

                    System.out.print("CPF: ");
                    String cpf = scan.nextLine();

                    System.out.print("Contato: ");
                    String contato = scan.nextLine();

                    // Criar o objeto Cliente
                    Cliente novoCliente = new Cliente(nome, dataNascimento, cpf, contato);

                    // Chamar o método da classe SistemaReservas
                    sistema.cadastrarCliente(novoCliente);
                    break;
                case 2:
                    //public void realizarReserva(String cpf, int numeroQuarto,
                    // Date dataEntrada, java.util.Date dataSaida)
                    System.out.println("Digite o CPF: ");
                    cpf = scan.nextLine();

                    System.out.println("Digite o numero do quarto");
                    int numeroQuarto = scan.nextInt();
                    scan.nextLine(); // Limpar o buffer

                    System.out.println("Digite a data de entrada: ");
                    String dataEntradaStr = scan.nextLine();
                    Date dataEntradaDate = null;

                    try {
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        dataEntradaDate = sdf.parse(dataEntradaStr);
                        System.out.println("Data de entrada convertida: " + dataEntradaDate);
                    } catch (Exception e) {
                        System.out.println("Formato de data inválido.");
                    }
                    scan.nextLine(); // Limpar o buffer

                    System.out.println("Digite a data de saída (formato dd/MM/yyyy): ");
                    String dataSaidaStr = scan.nextLine();
                    Date dataSaidaDate = null;

                    try {
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        dataSaidaDate = sdf.parse(dataSaidaStr);
                        System.out.println("Data de saída convertida: " + dataSaidaDate);
                    } catch (Exception e) {
                        System.out.println("Formato de data inválido.");
                    }

                    sistema.realizarReserva(cpf, numeroQuarto, dataEntradaDate, dataSaidaDate);

                    break;
                case 3:
                    sistema.listarReservas();
                    break;
                case 4:
                    sistema.listarQuartosDisponiveis();
                    break;
                case 5:
                    sistema.listarClientes();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

}



