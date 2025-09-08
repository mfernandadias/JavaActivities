package revisao.parte2;

public class ExemplosForEach {
    /*
    O for-each (também chamado de enhanced for) é uma forma simplificada de percorrer array e coleções em Java
     */

    //Estrutura
    /*
    for (Tipo elemento : arrayOuLista) {
    // código que usa "elemento"
      }
     */

    /*
    Tipo → tipo dos elementos (ex: int, String).
    elemento → variável temporária que recebe o valor atual.
    arrayOuLista → o array ou coleção que será percorrido.
     */
    public static void main(String[] args){
        String[] nomes = {"Ana", "Maria", "João"};


        //for tradicinal
        for(int i = 0; i < nomes.length; i++){
            System.out.println("Nome: " + nomes[i]);
        }

        // for-each (mais simples)
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }
    }
}
