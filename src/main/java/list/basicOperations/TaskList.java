package main.java.list.basicOperations;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description) {
        taskList.add(new Task(description));
    }

    public void deleteTask(String description) {
        List<Task> tasksToRemove = new ArrayList<>();
        for(Task t : taskList) {
            if(t.getDescription().equalsIgnoreCase(description)) {
                tasksToRemove.add(t);
            }
        }
        taskList.removeAll(tasksToRemove);
    }

    public int getTotalNumberOfTasks() {
        return taskList.size();
    }

    public void getDescriptonsTasks() {
        System.out.println(taskList);
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        System.out.println("O numero total de tarefas é: " + taskList.getTotalNumberOfTasks());

        taskList.addTask("Tarefa 01");
        taskList.addTask("Tarefa 02");
        taskList.addTask("Tarefa 03");
        taskList.addTask("Tarefa 03");
        System.out.println("O numero total de tarefas depois da inclusão é: " + taskList.getTotalNumberOfTasks());

        taskList.deleteTask("Tarefa 03");
        System.out.println("O numero total de tarefas depois da exclusão é: " + taskList.getTotalNumberOfTasks());

        taskList.getDescriptonsTasks();
    }
}
