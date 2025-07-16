package aCursoRevisao.secao1;

public class Exercicio01 {
    /*
    declare duas variaveis double para armazenar os valores 1575 e 20.40
    Some os valores dessas variaveis e armazena o resultado em uma nova variável double
    Exiba o resultado
     */
    double soma (double b, double c){
        double  teste = b + c;
        return teste;
    }
    public static void main(String[] args){
        Exercicio01 exemplo1 = new Exercicio01();

        double resultado;
        resultado = exemplo1.soma(10.00, 78.9);

        System.out.println(resultado);
    }
}
