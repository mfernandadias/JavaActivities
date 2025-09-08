package revisao.parte2.metodos;

public class Exercicio06 {
    /*
    2. Crie um método que receba a idade de uma pessoa e **retorne se ela é maior de idade**.
     */
   public boolean maiorDeIdade(int idade){
       if(idade >= 18){
           return true; //maior de idade
       }else {
           return false; //menor de idade
       }
   }

    public static void main(String[] args){

       Exercicio06 ex = new Exercicio06();

       System.out.println(ex.maiorDeIdade(25)); //false
        System.out.println(ex.maiorDeIdade(9));


    }
}
