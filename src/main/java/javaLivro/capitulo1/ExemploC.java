package javaLivro.capitulo1;

public class ExemploC {
    public static void main(String[] args){
        int x = 1;
        while(x <  10){
            if(x == 3){
                System.out.println("big x");
                break;
            }
            x = x + 1;
        }
    }
}
