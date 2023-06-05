package com.example.hci_demo.utils;

public class Task {
    public enum TeamType {
        Cleaning,
        Kitchen,
        Bartenders,
        Waiters
    }

    private boolean complete;
    private String name;
    private String description;
    private TeamType team;

    public Task(boolean complete, String name, String description, TeamType team) {

        this.complete = complete;
        this.name = name;
        this.description = description;
        this.team = team;
    }
    public Task(boolean complete, String name, String description) {

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

    public TeamType getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "Task{" +
                "complete=" + complete +
                ", name='" + name + '\'' +
                '}';
    }


}
