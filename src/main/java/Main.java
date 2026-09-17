import Controlador.TaskController;
import Vista.TaskView;
import Modelo.Task;

public class Main {
    public static void main(String[] args) {
        TaskView view = new TaskView();
        TaskController controller = new TaskController(view);

        controller.addTask(1, "Learn SOLID principles");
        controller.addTask(2, "Implement MVC pattern in Java");

        controller.updateView();

        controller.completeTask(1);

        controller.updateView();
    }
}
