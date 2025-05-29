package intermediarioRevisao.classesWrappers;

public class Exercicio04 {
    public static void main(String[] args){
        /*
        Use autoboxing para clocar um int em um Integer. Depois,
        desconverta (unboxing) e exiba
         */
        int valor = 10;
        Integer num = valor;

        valor = num;
        System.out.println(num);
    }
}
