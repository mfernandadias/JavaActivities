package intermediarioRevisao.metodos;

public class MetodoVoid {
    /*
    Descrição: Não retornam valor, apenas executam uma ação
     */
    public void exibirMensagem(){
        System.out.println("Mensagem");
    }
    public static void main(String[] args){
        MetodoVoid exemplo = new MetodoVoid();

        exemplo.exibirMensagem();
    }
}
