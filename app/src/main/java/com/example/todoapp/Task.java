package com.example.todoapp;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;
    private Category Category;
    public Task(){
        id=UUID.randomUUID();
        date=new Date();
        Category= com.example.todoapp.Category.HOME;
    }

    public void setName(String toString) {
        this.name=toString;
    }

    public Date getDate() {
        return date;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean isChecked) {
        this.done=isChecked;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public void setCategory(Category category){this.Category= category;}

    public Category getCategory() { return Category;}

    public void setDate(Date time) {this.date=time;}
}
