package example.view;

import example.model.Task;

import java.util.List;

public class TaskView {
    public void displayTasks(List<Task> tasks) {
        System.out.println("Lista de tareas:");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            String status = task.getCompleted() ? "[X]" : "[ ]";
            System.out.println(i + ". " + status + " " + task.getDescription() + " " + task.getDate());
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
