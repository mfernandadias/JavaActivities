package aCursoRevisao.secao21;

public class ExemploTryCatch {
    public static void main(String[] args){
        try{
            int resultado = 10/0;
            System.out.println("Resultaod: " + resultado);
        }catch(ArithmeticException e){
            System.out.println("Erro: divisão por zero");
        }
    }
}
