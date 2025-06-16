package intermediarioRevisao.metodos;

public class UtilMetodoStatic {
    /*
    Método estático (static)
    Descrição: pertencem à classe, não ao aobjeto. Chamados diretamente pela classe
    Exemplo
     */
    public static int dobrar(int x){
        return x * 2;
    }
    public static void main(String[] args){
        //uso
        int resultado = UtilMetodoStatic.dobrar(5);
    }
}
