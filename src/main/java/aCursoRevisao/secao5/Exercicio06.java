package aCursoRevisao.secao5;

public class Exercicio06 {
    public static void main(String[] args){
        /*
        Peça ao usuário para inserir uma letra
        Verifique se a letra é uma vogal (a, e, i, o, u) ou uma consoante
        Exiba "Vogal" ou "Consoante" de acordo com a entrada
        Considere tanto letras maiúsculas quanto minúsculas
         */
        char letra = 'a';

        switch(Character.toLowerCase(letra)){
            case 'a', 'e', 'i', 'o','u':
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
                break;
        }
    }
}
