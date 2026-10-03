package software.ulpgc.katas;

public record Task(String title, boolean completed) {
    public String status() {
        return completed ? "Completed" : "Pending";
    }

    public boolean isCompleted() {
        return completed;
    }
}
