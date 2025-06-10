package avancado.classesWrappers;

public class Exercicio02 {
    /*
    receba um número decimal como String, converta para Double e exiba a metade
     */
    public static void main(String[] args) {
        String valor = "133.5";
        double numeroDouble = Double.parseDouble(valor);

        System.out.println(numeroDouble / 2);
    }
}
