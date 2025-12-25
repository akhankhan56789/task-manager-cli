import java.util.ArrayList;

public class TaskManager {

    // List to store tasks
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        // Test add-task
        addTask("Learn Git Desktop");
        addTask("Practice Java");

        // Test show-task
        showTasks();

        // Test delete-task
        deleteTask(0);  // Deletes first task
        showTasks();    // Shows remaining tasks
    }

    // Add a task
    public static void addTask(String task) {
        if (task == null || task.isEmpty()) {
            System.out.println("Task cannot be empty");
        } else {
            tasks.add(task);
            System.out.println("Task added successfully: " + task);
        }
    }

    // Show all tasks
    public static void showTasks() {
        System.out.println("All Tasks:");
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (String task : tasks) {
                System.out.println("- " + task);
            }
        }
    }

    // Delete a task by index
    public static void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            System.out.println("Task deleted: " + tasks.get(index));
            tasks.remove(index);
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
