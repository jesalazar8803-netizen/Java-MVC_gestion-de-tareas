package Controlador;

import java.util.ArrayList;
import java.util.List;

public class TaskController {
    private List<Task> tasks;
    private TaskView view;

    public TaskController(TaskView view) {
        this.tasks = new ArrayList<>();
        this.view = view;
    }

    public void addTask(int id, String title) {
        Task task = new Task(id, title);
        tasks.add(task);
    }

    public void completeTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(true);
                break;
            }
        }
    }

    public void updateView() {
        view.printTaskDetails(tasks);
    }
}

