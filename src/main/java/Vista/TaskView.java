package Vista;

import java.util.List;

public class TaskView {
    public void printTaskDetails(List<Task> tasks) {
        for (Task task : tasks) {
            System.out.println("Task ID: " + task.getId());
            System.out.println("Title: " + task.getTitle());
            System.out.println("Completed: " + task.isCompleted());
            System.out.println("----------");
        }
    }
}

