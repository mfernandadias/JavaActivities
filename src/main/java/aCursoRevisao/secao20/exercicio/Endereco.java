package aCursoRevisao.secao20.exercicio;

public class Endereco {
    private String  rua;
    private int num;
    private String cidade;
    private String cep;

    public Endereco(String rua, String cep, String cidade, int num) {
        this.rua = rua;
        this.cep = cep;
        this.cidade = cidade;
        this.num = num;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
