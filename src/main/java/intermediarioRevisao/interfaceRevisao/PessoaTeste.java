package intermediarioRevisao.interfaceRevisao;

import java.util.function.Predicate;

public class PessoaTeste {
    public static void main(String[] args){
        Pessoa p = new Pessoa(17, "Ana");

        Predicate<Pessoa> podeVotar = pessoa -> pessoa.idade >= 16;
        System.out.println(podeVotar.test(p));
    }
}
