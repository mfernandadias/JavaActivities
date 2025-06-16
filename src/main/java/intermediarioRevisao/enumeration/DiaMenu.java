package intermediarioRevisao.enumeration;

public class DiaMenu {
    public static void main(String[] args){
        /*
        Crie um método que receba um DiaSemana e imprima uma mensgaem diferente para cada
        dia usando switch
         */
        Dia dia = Dia.DOMINGO;
        switch (dia){
            case Dia.SEGUNDA -> System.out.println("Segunda fera");
            case Dia.TERCA -> System.out.println("Terça feira");
            case Dia.QUARTA -> System.out.println("Quarta feira");
            case Dia.QUINTA -> System.out.println("Quinta feira");
            case Dia.SEXTA -> System.out.println("Sexta feira");
            case Dia.SABADO -> System.out.println("Sabado");
            case Dia.DOMINGO -> System.out.println("Domingo");

        }
    }
}
