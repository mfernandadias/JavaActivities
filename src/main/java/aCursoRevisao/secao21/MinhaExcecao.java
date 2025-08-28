package aCursoRevisao.secao21;

public class MinhaExcecao extends Exception {
    public MinhaExcecao(String mensagem){
        super(mensagem);
    }

    public static void main(String[] args){
        try {
            validarNota(-1);
        } catch (MinhaExcecao e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void validarNota(int nota) throws MinhaExcecao {
        if (nota < 0 || nota > 10) {
            throw new MinhaExcecao("Nota fora do intervalo!");
        }

    }

}
