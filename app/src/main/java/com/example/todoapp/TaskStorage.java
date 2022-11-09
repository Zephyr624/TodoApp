package com.example.todoapp;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {
    private static final TaskStorage taskStorage = new TaskStorage();
    private final List<Task> tasks;
    public static  TaskStorage getInstance() {
    return taskStorage;
    }
    private TaskStorage(){
        tasks = new ArrayList<>();
        for(int i= 1 ; i<=150 ; i++){
            Task task = new Task();
            task.setName("Zadanie todo nr " + i);
            task.setDone(i%3==0);
            if(i%3==0){
                task.setCategory(Category.STUDIES);
            }else{
                task.setCategory(Category.HOME);
            }
            tasks.add(task);
        }
    }
    public void addTask(Task task){
        tasks.add(task);
    }
    public List<Task> getTasks(){
        return tasks;
    }
    public Task getTask(UUID number) {
        Task task=null;
        for (int i = 0; i < tasks.size(); i++) {
            task = tasks.get(i);
            if (task.getId().equals(number) ) {
                break;
            }
        }
        return task;
    }
}
