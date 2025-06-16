package projetos.ToDoList.Configuration;

import projetos.ToDoList.Model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskConfiguration {
    private List<Task> tasks = new ArrayList<>();
    //poque começa com 1
    private int nextId = 1;

    public void addTask(String title, String descrition){
        Task task = new Task(nextId++, title, descrition);
        tasks.add(task);
        System.out.println("Tarefa addicionada com sucesso!");
    }

    //listar tarefas
    public void listTasks(){
        if(tasks.isEmpty()){
            System.out.println("Nenhuma tarefa cadastrada");
            return;
        }
        for(Task task : tasks){
            System.out.println(task);
        }
    }

    public void maskAsCompleted(int id){
        Task task = findTaskById(id);
        if(task != null){
            task.setCompleted(true);
            System.out.println("Tarefa marcada como concluida");
        }else {
            System.out.println("Tarefa não encontrada");
        }
    }

    public void editTask(int  id, String newTitle, String newDescription){
        Task task = findTaskById(id);

        if(task != null){
            task.setTitle(newTitle);
            task.setDescrition(newDescription);
            System.out.println("TArefa não encontrada");
        }else {
            System.out.println("Tarefa não encontrada");
        }
    }

    public void removeTask(int id){
        Task task = findTaskById(id);
        if(task != null){
            tasks.remove(task);
            System.out.println("Tarefa removido com sucesso");
        }else {
            System.out.println("Tarefa não encontrada");
        }
    }

    private Task findTaskById(int id){
        for(Task task : tasks){
            if(task.getId() == id){
                return task;
            }
        }
        return null;
    }

    /*
    Adicionar tarefa com título e descrição.
Listar todas as tarefas.
Marcar tarefa como concluída.
Editar tarefa existente.
Remover tarefa por ID.
Salvar as tarefas em memória (usando ArrayList).
     */
}
