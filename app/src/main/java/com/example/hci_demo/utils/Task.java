package com.example.hci_demo.utils;

public class Task {
    public enum UserType {
        guest,
        supplier,
        staff,
        orginazer
    }

    private boolean complete;
    private String name;
    private String description;
    private String Team;
    public Task(boolean complete, String name, String description,String Team) {

        this.complete = complete;
        this.name = name;
        this.description = description;
    }
    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return complete;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "complete=" + complete +
                ", name='" + name + '\'' +
                '}';
    }


}
