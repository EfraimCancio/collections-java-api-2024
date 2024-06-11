package main.java.list.basicOperations;

public class Task {

    private String description;

    public Task(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }
}