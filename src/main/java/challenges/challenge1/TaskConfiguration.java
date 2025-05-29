package challenges.challenge1;

import java.util.Date;
import java.util.List;
import java.util.Comparator;

public class TaskConfiguration {
    private List<Task> tarefas;

    public TaskConfiguration(List<Task> tarefas) {
        this.tarefas = tarefas;
    }

    //adicionar nota tarefa
    public void adicionarTarefa(Task task){
        tarefas.add(task);
    }

    //listas todas as terafas
    public void listarTodas(){
        if(tarefas.isEmpty()){
            System.out.println("Nenhuma tarefa cadastrada");
        }else {
            tarefas.forEach(System.out::println);
            /*
            for(Task tarefa : tarefas){
                     System.out.println("tarefa");
                }
             */
        }
    }

    //filtrar tarefas vencidas
    public void listarTarefas(){
        Date hoje = new Date();
        boolean encontrou = false;

        for (Task t : tarefas) {
            if (t.getDeadLine().before(hoje)) {
                System.out.println(t);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma tarefa vencida.");
        }
    }

    // Ordenar por data e prioridade
    public void ordenarPorDataEPrioridade() {
        tarefas.sort(new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                int compareData = t1.getDeadLine().compareTo(t2.getDeadLine());
                if (compareData != 0) return compareData;

                // Converte prioridade em ordem numérica: ALTA < MEDIA < BAIXA
                return getPrioridadeValor((Priority)t1.getPriority()) - getPrioridadeValor((Priority)t2.getPriority());
            }

            private int getPrioridadeValor(Priority p) {
                switch (p) {
                    case LOW: return 1;
                    case MEDIUM: return 2;
                    case HIGH: return 3;
                    default: return Integer.MAX_VALUE;

                }
            }
        });

        System.out.println("Tarefas ordenadas por data e prioridade:");
        listarTodas();
    }
}
