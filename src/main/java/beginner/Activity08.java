package beginner;

public class Activity08 {
    public static void main(String[] args){
        int ano = 2025;

        if((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println("é um ano bissexto");
        }else{
            System.out.println("Não é um ano bissexto");
        }
    }
}
