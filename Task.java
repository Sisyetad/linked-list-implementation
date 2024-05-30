package com.toDoListApp;

public class Task {
    private String Title, Description;
    private boolean Completed;
    public Task(String Title,String Description){
        this.Title=Title;
        this.Description=Description;
        this.Completed=false;
    }
    public String getTitle(){
        return Title;
    }
    public String getDescription(){
        return Description;
    }
    public void markCompleted(){
        this.Completed=true;
    }
    public boolean isCompleted(){
        return Completed;
    }

}
