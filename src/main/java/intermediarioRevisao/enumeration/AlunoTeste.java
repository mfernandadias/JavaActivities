package intermediarioRevisao.enumeration;

import static intermediarioRevisao.enumeration.Nota.REGULAR;
import static intermediarioRevisao.enumeration.Nota.RUIM;

public class AlunoTeste {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno("Maria Fernanda dos Santos", RUIM);
        Aluno aluno2 = new Aluno("Mareliza dos Santos", REGULAR);

        System.out.println(aluno1);
        System.out.println(aluno2); 
    }
}
