package com.toDoListApp;

public class Main {
    public static void main(String[] args) {
        ToDoListManager list = new ToDoListManager();
        list.add(new Task("Album1","my first album that contains 12 tracks!"));
        list.add(new Task("Anime","waite disney animation"));
        list.add(new Task("SewLese","the best movie before 10 years in Ethiopia"));
        list.markToDoAsCompleted("Anime");
        list.viewTodoLIST();
    }
}