package aCursoRevisao.secao17;

public final class Endereco {
    /*
    Classe Imutáveis
    O que são?
    Uma classe imutável é aquela onde os atributos não podem ser alterados após
    a acriação do objeto
    Muito usada para segurança, concorr~encia, objetos de valor (como datas,
    localizações etc)

    📌 Regras para ser imutável:
       Atributos são private final.
       Não há setters.
       Valores são passados no construtor.
     */

    private final String rua;
    private final int numero;

    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }
    /*
    🎯 Explicação:
final → o valor não pode mudar depois da criação.

Sem set → o valor nunca será alterado.

Classe é final → ninguém pode herdar e tentar mudar o comportamento.
     */
}
