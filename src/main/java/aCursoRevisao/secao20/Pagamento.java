package aCursoRevisao.secao20;

public interface Pagamento {

    //método abstrato
    void processsarPagamento(double valor);

    //método com default
    default void exibirRecibo(double valor){
        System.out.println("Recibo do pagamento, com valor de R$" + valor);
    }

}
