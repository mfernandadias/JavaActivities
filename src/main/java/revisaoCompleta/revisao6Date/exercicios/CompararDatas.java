package revisaoCompleta.revisao6Date.exercicios;

import java.util.Date;

public class CompararDatas {
    public static void main(String[] args){
        Date data1 = new Date();
        Date data2 = new Date(System.currentTimeMillis() + 1000); //10 segundos depois

        System.out.println("Data1 é antes de Data2? " + data1.before(data2));
        System.out.println("Data1 é depois de Data2? " + data1.after(data2));
    }
}

/*
✅ Comparando Date vs LocalDate:
| Aspecto                                             | `Date`      | `LocalDate / LocalDateTime` |
| --------------------------------------------------- | ----------- | --------------------------- |
| Pacote                                              | `java.util` | `java.time`                 |
| Recomendado para novos projetos?                    | ❌           | ✅                           |
| Mais preciso para trabalhar com fusos, zonas, horas | ❌           | ✅                           |
| Métodos mais modernos e legíveis                    | ❌           | ✅                           |

 */
