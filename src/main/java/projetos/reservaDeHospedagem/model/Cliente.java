package projetos.reservaDeHospedagem.model;

import java.time.LocalDate;

public class Cliente {
    private String name;
    private String contato;
    private String cpf;
    private LocalDate dataNascimento;
    //private String email;

    public Cliente(String name, LocalDate dataNascimento, String cpf, String contato) {
        this.name = name;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.contato = contato;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", contato='" + contato + '\'' +
                ", cfp='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
