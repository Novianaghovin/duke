import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        Task newTask = new Task(description);
        tasks.add(newTask);
        System.out.println("added: " + description);
    }

    public void listTasks() {
        System.out.println("The current vibe is:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + "." + tasks.get(i).toString());
        }
    }

    public void markTask(int taskNumber) {
        int index = taskNumber - 1;
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsDone();
            System.out.println("Slay, you completed the task. Let's go!");
            System.out.println("  " + tasks.get(index).toString());
        } else {
            System.out.println("It's giving 'error'. That task number is sus.");
        }
    }

    public void unmarkTask(int taskNumber) {
        int index = taskNumber - 1;
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsUndone();
            System.out.println("No cap, this one's un-marked. Back to the grind.");
            System.out.println("  " + tasks.get(index).toString());
        } else {
            System.out.println("It's giving 'error'. That task number is sus.");
        }
    }
}