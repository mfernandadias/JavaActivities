package intermediarioRevisao.strings;

public class Exemplo1 {
    public static void main(String[] args){
        /*
        Em Java, String é uma classe imutável(não pode ser alterada após criada).
        Quando você modifica uma striing, o Java cria um novo objeto ao invés de alterar
        o existente
         */
        String nome = "João";
        nome = nome + " Silva "; //issso cria uma nova String;

        /*
        Por que String é imutáveç?
        * Segurança (ex: senha em URL)
        * Reutilização (eficiência de memória com String Pool)
        * Segurança em Threads (imutabilidade evita problemas de concerrência)
         */

        /*
        Suportam diversos métodos úteis (ex: .length(), .toLowerCase(), .equals()).
         */

        /*
        Como funciona o Pool de Strings
        Strings literais são armazenadas no String Pool para reutilização
         */
        String a = "Java";
        String b = "Java";
        System.out.println( a == b); //true - ambas apontam para o mesmo objeto no pool

        /*
        Comparar strings usando .equals()
        evite == para comparar cnteúdo, use .equals
         */
        String nome1 = new String("Maria");
        String nome2 = "Maria";
        System.out.println(nome1 == nome2); // false (compara referências)
        System.out.println(nome1.equals(nome2)); // true (compara conteúdo)

        /*
        .intern() e exemplos
        O método .intern() adiciona a string ao poll se ainda não estiver
         */
        String nome3 = new String("Calors");
        String internada = nome.intern();
        String literal = "Carlos";
        System.out.println(internada == literal); // true

        /*
        Usando StringBuilder
        Mais eficiente para modicadores frequentes
         */
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 1000; i++){
            sb.append(i);
        }
        System.out.println(sb.toString());

        /*
        Quando a concatenação é uma boa opção
        Concatenação com + funciona bem fora de loops
         */
        String fernanda = "Ana " + " Paula";

        /*
        Aula 162 - Retornando um pedaço de uma string
        Use substring(inicio, fim)
         */
        String frase = "Aprendendo Java";
        System.out.println(frase.substring(0, 10)); //aprendendo

        /*
        Encontrando texto em  uma String
        use .contains() ou indexOf()
         */
        String fraseExemplo2 = "Curso de Java";
        System.out.println(fraseExemplo2.contains("Java")); // true
        System.out.println(fraseExemplo2.indexOf("Java")); // 9

        /*
        Aula 164 - Substituindo texto
        Use .replace() ou .replaceAll()
         */
        String texto = "Olá Mundo";
        System.out.println(texto.replace("Mundo", "Java")); //Olá Java

        /*
        Comparando Strings alfabeticamente
        Use .compareTo()
         */
        String c = "Ana";
        String g = "Bruno";
        System.out.println(a.compareTo(g)); //valor negativo: Ana vem antes de Bruno

    }
}
