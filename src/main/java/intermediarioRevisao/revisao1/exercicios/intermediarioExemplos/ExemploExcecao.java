package intermediarioRevisao.revisao1.exercicios.intermediarioExemplos;

public class ExemploExcecao {
    public static void main(String[] args){
        try{
            int a = 10 / 0;  //lança ArtimeticExpection
        }catch (ArithmeticException e){
            System.out.println("Erro: " + e.getMessage());
        }finally{
            System.out.println("Bloco finally sempre é executado");
        }

        /*
        throw --> Lança uma exceção
        throws --> indica que um método pode lançar exceção
         */
    }
}
