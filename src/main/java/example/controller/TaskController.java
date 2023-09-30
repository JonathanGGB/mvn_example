package example.controller;

import example.model.Task;
import example.model.TaskList;
import example.view.TaskView;

import java.util.List;

public class TaskController {
    private TaskList taskList;
    private TaskView taskView;

    public TaskController(TaskList taskList, TaskView taskView) {
        this.taskList = taskList;
        this.taskView = taskView;
    }

    public void addTask(String description, boolean completed, String date) {
        Task task = new Task(description, completed, date);
        taskList.addTask(task);
        taskView.displayMessage("Tarea agregada: " + description);
    }

    public void displayTasks() {
        List<Task> tasks = taskList.getTasks();
        taskView.displayTasks(tasks);
    }
}
