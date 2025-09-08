package revisao.parte2.metodos;

public class Exercicio02 {
    /*
    crie um método que receba um número inteiro e retorne o dobro desse número
     */
    public void retorno(int valor){
        int resultado = valor * valor;
        System.out.println(resultado);
    }

    public static void main(String[] args){

        Exercicio02 calculo = new Exercicio02();

        calculo.retorno(10);



    }
}
