package intermediarioRevisao.enumeration;

public class DiaTeste {
    public static void main(String[] args){
        Dia dia = Dia.QUARTA;

        System.out.println(dia);

        String tipo = switch(dia){
            case SABADO, DOMINGO -> "FIm de semana";
            default -> "Dia útil";
        };
        System.out.println("");

        for(Dia data : Dia.values()){
            System.out.println(data);
        }
    }
}
