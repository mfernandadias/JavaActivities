package intermediarioRevisao.enumeration;

import static intermediarioRevisao.enumeration.Sexo.FEMININO;
import static intermediarioRevisao.enumeration.Sexo.MASCULINO;

public class PessoaTeste {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Maria Fernanda dos Santos Dias", FEMININO);
        Pessoa pessoa2 = new Pessoa("Vinicius", MASCULINO);
    }
}
