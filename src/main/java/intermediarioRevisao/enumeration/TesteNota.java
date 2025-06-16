package intermediarioRevisao.enumeration;

public class TesteNota {
    public static void main(String[] args){
        String valor = "Bom";

        //convertendo String para enum
        Nota nota = Nota.valueOf(valor);

        System.out.println("Nota convertida: " + nota);
    }
}
