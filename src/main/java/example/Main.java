package example;
import example.model.TaskList;
import example.view.TaskView;
import example.controller.TaskController;

public class Main {

    public static void main(String[] args) {
        TaskList tasks = new TaskList();
        TaskView taskView = new TaskView();
        TaskController taskController = new TaskController(tasks, taskView);

        taskController.addTask("Tarea 1", true, "Lunes");
        taskController.addTask("Tarea 2", false, "Martes");
        taskController.addTask("Tarea 3", true, "Domingo");

        taskController.displayTasks();
    }
}
