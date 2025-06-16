package intermediarioRevisao.enumeration;

public class DirecaoTeste {
    public static void main(String[] args){
        Direcao d = Direcao.LESTE;

        switch(d){
                case NORTE -> System.out.println("VocÊ está indo para o Norte");
                case SUL -> System.out.println("Você está indo para o Sul");
                case LESTE -> System.out.println("Você está indo para o Leste");
                case OESTE -> System.out.println("Você está indo para o Oeste");
        }
    }
}
