package software.ulpgc.katas;

public class Main {

    public static void main(String[] args) {
        Task task = new Task("Finish Kata1", false);

        System.out.println("Task: " + task.title());
        System.out.println("Status: " + task.status());
        System.out.println("Completed: " + task.isCompleted());
    }
}