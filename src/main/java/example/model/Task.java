package example.model;

public class Task {

    private String description;
    private Boolean completed;

    private String date;

    public Task(String description){
        this.description = description;
    }

    public Task(String description, boolean completed){
        this.description = description;
        this.completed = completed;
    }

    public Task(String description, boolean completed, String date){
        this.description = description;
        this.completed = completed;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public String getDate(){
        return this.date;
    }
}
