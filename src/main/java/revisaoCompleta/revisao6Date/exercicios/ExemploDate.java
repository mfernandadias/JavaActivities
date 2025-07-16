package revisaoCompleta.revisao6Date.exercicios;

import java.util.Date;

public class ExemploDate {
    public static void main(String[] args){
        Date agora =  new Date(); //Data e hora atuais

        System.out.println("Data atual: " + agora); //
    }
}
/*
📌 Métodos importantes da classe Date:

| Método              | O que faz?                                            |
| ------------------- | ----------------------------------------------------- |
| `getTime()`         | Retorna a data/hora em milissegundos desde 01/01/1970 |
| `before(Date d)`    | Verifica se a data atual é antes de outra             |
| `after(Date d)`     | Verifica se a data atual é depois de outra            |
| `compareTo(Date d)` | Compara duas datas (-1, 0, 1)                         |
| `toString()`        | Converte a data para String legível                   |

 */
