package projetos.ToDoList;
import projetos.ToDoList.Configuration.TaskConfiguration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        TaskConfiguration manager = new TaskConfiguration();
        int option;

        do{
            System.out.println("To-do List");
            System.out.println("1 - Add task");
            System.out.println("2 - List tasks");
            System.out.println("3 - Mark as completed");
            System.out.println("4 - Edit task");
            System.out.println("5 - Remove task");
            System.out.println("0 - Exit");
            System.out.println("Choose an option:");
            option = scan.nextInt();  //limpar o buffer
            scan.nextLine();
            switch(option){
                case 1:
                System.out.print("Título: ");
                String title = scan.nextLine();
                System.out.print("Descrição: ");
                String description = scan.nextLine();
                manager.addTask(title, description);
                break;

                case 2:
                    manager.listTasks();
                    break;

                case 3:
                    System.out.print("ID da tarefa: ");
                    int idToComplete = scan.nextInt();
                    manager.maskAsCompleted(idToComplete);
                    //maskAsCompleted
                    break;

                case 4:
                    System.out.print("ID da tarefa: ");
                    int idToEdit = scan.nextInt();
                    scan.nextLine(); // limpar buffer
                    System.out.print("Novo título: ");
                    String newTitle = scan.nextLine();
                    System.out.print("Nova descrição: ");
                    String newDesc = scan.nextLine();
                    manager.editTask(idToEdit, newTitle, newDesc);
                    break;

                case 5:
                    System.out.print("ID da tarefa: ");
                    int idToRemove = scan.nextInt();
                    manager.removeTask(idToRemove);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (option != 0);


    }
}
