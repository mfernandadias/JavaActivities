package revisao.parte2;

public class ExemplosMetodos {

    //metodos void (não retorna nada)
    public void saudacao(String nome){
        System.out.println("Olá " + nome);
    }

    //metodo com retorno
    public int soma(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
        ExemplosMetodos ex = new ExemplosMetodos();

        ex.saudacao("Maria");

        int resultado = ex.soma(5, 3);

        System.out.println("Soma: " + resultado);
    }

    // Método void
    public void exibirMensagem() {
        System.out.println("Este é um método void (não retorna valor).");
    }

    // Método com retorno
    public int dobrar(int numero) {
        return numero * 2;
    }

    // Método com múltiplos parâmetros
    public String criarFrase(String nome, int idade) {
        return "Olá, meu nome é " + nome + " e eu tenho " + idade + " anos.";
    }

}
