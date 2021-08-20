package de.dejan.todolist;

import java.util.*;



public class Main{

    static int taskID=0;
    static ArrayList<ToDo> tasks=new ArrayList<ToDo>();

    public static void main( String[] args ){
        
        while (true) {
            menu();
        }
        

    }

    public static void menu(){

        System.out.println("\n[1]Neues ToDo hinzufügen");
        System.out.println("[2]ToDos auflisten");
        System.out.println("[3]Beenden");

        int in=Integer.parseInt(System.console().readLine());

        switch (in) {
            case 1: newTask(); break;
            case 2: listToDo(); break;
            case 3: System.exit(0);
        }

    }

    public static void newTask(){

        System.out.println("\nAufgabe hinzufügen:");

        String in=System.console().readLine();

        ToDo task=new ToDo(taskID, in);
        tasks.add(task);
        taskID++;
        return;
    }

    public static void listToDo(){
        System.out.println("\n\nToDo:");
        System.out.println("=====");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("["+tasks.get(i).theId+"] "+tasks.get(i).theContent);
        }
    }

}
