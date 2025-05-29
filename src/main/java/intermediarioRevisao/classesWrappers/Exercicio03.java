package intermediarioRevisao.classesWrappers;

public class Exercicio03 {
    /*
    crie um array de int[] e um de Integer[]. Atribua valores iguais
    e mostre a diferença entre eles
    */
    public static void main(String[] args){
        int[] valorInt = {1, 2, 3, 4, 5, 6};
        Integer[] valor = {1, 2, 3, 4, 5, 6, 9};

        for(int i = 1; i < valorInt.length; i++){
            System.out.println(valorInt[i]);
        }
        System.out.println("  ");
        for(int i = 0; i < valor.length; i++){
            System.out.println(valor[i]);
        }
    }
}
