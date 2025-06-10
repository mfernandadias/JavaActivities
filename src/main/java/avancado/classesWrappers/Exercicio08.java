package avancado.classesWrappers;

public class Exercicio08 {
    /*
    converta um número binário em String para int usando Integer.parseint(str, 2)
    Claro! Para converter um número binário (representado como String) em um número inteiro (int) em Java,
    você pode usar o método Integer.parseInt(String s, int radix) com a base 2.
    Aqui está um exemplo completo:
    */
    public static void main(String[] args){
        String binario = "1101"; //binário para 13
        int numero = Integer.parseInt(binario, 2);
        System.out.println("O número inteiro é: " + numero);

    }
}
