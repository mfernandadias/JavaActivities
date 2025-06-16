package projetos.ToDoList.Model;

import java.util.Date;

public class Task {
    private String title;
    private String descrition;
    private int ID;
    private boolean completed;
    //private Date deadline;

    public Task(int ID, String title, String descrition) {
        this.title = title;
        this.completed = false;
        this.ID = ID;
        this.descrition = descrition;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /*public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    } */

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getId() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + title + '\'' +
                ", descrition='" + descrition + '\'' +
                ", ID=" + ID +
                ", completed=" + completed +
                '}';
    }
}
