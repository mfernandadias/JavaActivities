package challenges.challenge1;

import java.util.Date;

public class Task {
    private String title;
    private String description;
    private Date deadLine;
    Enum priority;

    public Task(String title, Enum priority, Date deadLine, String description) {
        this.title = title;
        this.priority = priority;
        this.deadLine = deadLine;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Enum getPriority() {
        return priority;
    }

    public void setPriority(Enum priority) {
        this.priority = priority;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", deadLine=" + deadLine +
                ", priority=" + priority +
                '}';
    }
}
