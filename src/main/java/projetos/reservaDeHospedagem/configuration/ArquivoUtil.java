package projetos.reservaDeHospedagem.configuration;

import projetos.reservaDeHospedagem.model.Cliente;
import projetos.reservaDeHospedagem.model.Quarto;
import projetos.reservaDeHospedagem.model.Reserva;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArquivoUtil implements Serializable {
    private static String CLIENTES_ARQ = "clientes.dat";
    private static  String QUARTOS_ARQ = "quartos.dat";
    private static String RESERVAS_ARQ = "reservas.dat";

    // Clientes
    public static void salvarClientes(List<Cliente> clientes) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(CLIENTES_ARQ))) {
            out.writeObject(clientes);
        } catch (IOException e) {
            System.out.println("Erro ao salvar clientes: " + e.getMessage());
        }
    }

    public static List<Cliente> carregarClientes() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(CLIENTES_ARQ))) {
            return (List<Cliente>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Nenhum cliente carregado. Iniciando lista vazia.");
            return new ArrayList<>();
        }
    }

    // Quartos
    public static void salvarQuartos(List<Quarto> quartos) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(QUARTOS_ARQ))) {
            out.writeObject(quartos);
        } catch (IOException e) {
            System.out.println("Erro ao salvar quartos: " + e.getMessage());
        }
    }

    public static List<Quarto> carregarQuartos() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(QUARTOS_ARQ))) {
            return (List<Quarto>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Nenhum quarto carregado. Iniciando lista vazia.");
            return new ArrayList<>();
        }
    }

    // Reservas
    public static void salvarReservas(List<Reserva> reservas) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(RESERVAS_ARQ))) {
            out.writeObject(reservas);
        } catch (IOException e) {
            System.out.println("Erro ao salvar reservas: " + e.getMessage());
        }
    }

    public static List<Reserva> carregarReservas() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(RESERVAS_ARQ))) {
            return (List<Reserva>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Nenhuma reserva carregada. Iniciando lista vazia.");
            return new ArrayList<>();
        }
    }
}
