package aCursoRevisao.secao5;

public class ExemploSwitch {
    public static void main(String[] args){
        int diaDaSemana = 1;

        switch(diaDaSemana){
            case 1:
                System.out.println("Segunda feira");
                break;
            case 2:
                System.out.println("Terça feira");
                break;
            default:
                System.out.println("Valor inserido incorretamente");
                break;
        }
    }
}
