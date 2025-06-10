package avancado.classesWrappers;

public class Exercicio07 {
    public static String formatarDouble(double numero){
        return String.format("%.2f", numero);
    }
    public static void main(String[] args){
        /*
        crie um método que recebe double e retorna a representação como String com
        duas casas decimais
         */
      double valor1 = 1234.457;
      double valor2 = 789.457;

      String valorFormatado1 = formatarDouble(valor1);
      String valorFormatado2 = formatarDouble(valor2);

        System.out.println("Valor original: " + valor1 + ", valor formatado: " + valorFormatado1);
        System.out.println("Valor original: " + valor2 + ", valor formatado: " + valorFormatado2);

    }
}
