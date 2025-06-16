package intermediarioRevisao.enumeration;

public class MesTeste {
    public static void main(String[] args){

        Mes[] meses = Mes.values();

        //Imprime os 6 primeiros
        for(int i = 0; i<6; i++){
            System.out.println(meses[i]);
        }


    }
}
