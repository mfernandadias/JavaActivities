package beginner.switchExercicios;

public class Exercicio01 {
    public static void main(String[] args){
        DiaDaSemana dia = DiaDaSemana.QUARTA;

        switch(dia){
            case SEGUNDA -> System.out.println("Segunda feira");
            case TERCA -> System.out.println("Terca feira");
            case QUARTA -> System.out.println("Quarta feira");
            case QUINTA -> System.out.println("Quarta feira");
            case SEXTA -> System.out.println("Quinta feira");
            case SABADO -> System.out.println("sabado");
        }
    }
}
