package beginner;

public class Acticity07 {
    /*
    Crie um programa que leia três números interios e verifique se pelo menos um deles
    é maior que 10 (usando o operador ||). Em seguida, verifique se todos são maiores que 10
    (usando o perador &&)
     */
    public static void main(String[] args){
        int a = 10;
        int b = 9;
        int c = 11;

        if((a > 10) || (b > 10) || (c > 10)){
            System.out.println("A ou B não maiores que 10");
        }else {
            System.out.println("Nenhum número é maior que 10");
        }

        if ((a > 10) && (b > 10) && (c > 10)) {
            System.out.println("Todos os números são maiores que 10");
        } else {
            System.out.println("Nem todos os números são maiores que 10");
        }
    }
}
