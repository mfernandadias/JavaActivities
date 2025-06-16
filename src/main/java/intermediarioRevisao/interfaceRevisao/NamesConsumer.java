package intermediarioRevisao.interfaceRevisao;

import java.util.function.Consumer;

public class NamesConsumer {
    public static void main(String[] args){
        String[] nomes = {"Ana", "João", "Carlos"};
        Consumer<String> saudacao = nome -> System.out.println("Oi, " + nome);

        for(String nome : nomes){
            saudacao.accept(nome);
        }
    }
}
