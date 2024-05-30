package com.toDoListApp;

public class ToDoListManager {
    private Node head;
    public ToDoListManager(){
        head=null;
    }
    public void add(Task task){
        Node newNode =new Node(task);
        if(head==null){
            head= newNode;
        }
        else{
            Node current = head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    public void markToDoAsCompleted(String title){
        Node current = head;
        while(current != null){
            if(current.task.getTitle().equals(title)) {
                current.task.markCompleted();
                System.out.printf("the %s is completed!\n",title);
                return;
            }
            current = current.next;
        }
        System.out.printf("%s to do is not found in this list!\n",title);
    }
    public void viewTodoLIST(){
        Node current = head;
        System.out.println("lists of the to do list: ");
        while(current != null){
            System.out.println(current.task.getTitle());
            current=current.next;
        }

    }
}
