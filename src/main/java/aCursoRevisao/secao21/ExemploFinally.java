package aCursoRevisao.secao21;

public class ExemploFinally {
    public static void main(String[] args){
        try{
            System.out.println("Abrindo recurso... ");
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ìndice inválido");
        }finally{
            System.out.println("Fechando recurso (sempre executa)");
        }
    }
}


/*
Explicação: O finally sempre é executado, mesmo que ocorra exceção
 */