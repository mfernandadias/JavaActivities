package aCursoRevisao.secao4;

import javax.print.attribute.standard.Media;

public class MediaAluno {
    /*
    Obter nome do aluno e 3 notas
    Exibir mensagem com nome e média final
    Bônus: Se a nota for maior ou igual a 7, imprimir Aprovado, se não: reprovado
     */

    void media(double a, double b, double c ){
        double media = a + b + c;
        if(media >= 7){
            System.out.println("Parabéns você foi aprovado");
        }else{
            System.out.println("Infelizmente sua nota não foi suficiente");
        }

    }
    public static void main(String[] args){
        MediaAluno exemplo1 = new MediaAluno();
        exemplo1.media(4, 7, 8);
    }
}
