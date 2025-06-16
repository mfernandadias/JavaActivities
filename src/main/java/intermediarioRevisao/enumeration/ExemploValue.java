package intermediarioRevisao.enumeration;

public class ExemploValue {

    public static void main(String[] args0) {

        String entrada = "JANEIRO";
        //sintaxe - exemplo Enum
        Mes nome = Mes.valueOf(entrada);

        System.out.println("Dia selecionado: "+ nome);
    }
}

/*
O que é valueOf() em Enum ?
O método valueOf() é um método estático que existe em todos os enums em Java.
Ele serve para converter uma String em uma constante do enum, desde que a String
seja exatemnte igual ao nomes da constate (mesmo em caixa alta)
 */