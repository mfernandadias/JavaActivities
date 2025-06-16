package intermediarioRevisao.metodos;

public class MetodoComParametros {
    /*
    Descrição: recebem valores para operar
     */
    public void dizerOi(String nome){
        System.out.println("Oi " + nome);

    }
    public static void main(String[] args){
        MetodoComParametros name = new MetodoComParametros();

        name.dizerOi("Fernanda");
    }
}
