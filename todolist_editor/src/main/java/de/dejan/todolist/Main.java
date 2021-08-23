package de.dejan.todolist;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import de.dejan.todolist.io.ToDoListFromToJSON;



public class Main{

    static ArrayList<ToDo> tasks=new ArrayList<ToDo>();

    public static void main( String[] args ){

        //ArrayList<ToDo> tasks_ = ToDoListFromToJSON.loadToDoList("theList.json");

        for (int i = 0; i < ToDoListFromToJSON.loadToDoList("theList.json").size(); i++) {
            tasks.add(ToDoListFromToJSON.loadToDoList("theList.json").get(i));
        }
        
        while (true) {
            menu();
        }
        
    }

    public static void exit(){
        ToDoListFromToJSON.saveToDoList(tasks, "theList.json");
        System.exit(0);
    }

    public static void menu(){

        System.out.println("\n[1]Neues ToDo hinzufügen");
        System.out.println("[2]ToDos auflisten");
        System.out.println("[3]ToDo abhaken/als nicht erledigt markieren");
        System.out.println("[4]ToDo löschen");
        System.out.println("[5]ToDos nach Deadline sortieren");
        System.out.println("[6]Beenden");
        System.out.print(">>>");

        int in=Integer.parseInt(System.console().readLine());

        switch (in) {
            case 1: newTask(); break;
            case 2: listToDo(); break;
            case 3: done(); break;
            case 4: delTask(); break;
            case 5: sortByDeadline(); break;
            case 6: exit();
        }

    }

    public static void newTask(){
        System.out.println("\nAufgabe hinzufügen:");

        String in=System.console().readLine();

        System.out.println("Datum und Zeit im Format [dd.MM.yyyy HH:mm] angeben!:");
        String deadlineAsString=System.console().readLine();



        ToDo task;
        task = new ToDo(tasks.size(), in, false);

        try {
            task.setDeadline(new SimpleDateFormat("dd.MM.yyyy HH:mm").parse(deadlineAsString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        tasks.add(task);
        return;
    }

    public static void listToDo(){
        System.out.println("\n\nToDo:");
        System.out.println("=====");
        System.out.println("Nr. | ToDo | Deadline | erledigt");
        for (int i = 0; i < tasks.size(); i++) {
            char done_;
            if (tasks.get(i).getDone()) {
                done_='Y';
            }else{
                done_='N';
            }
            System.out.println("["+tasks.get(i).getID()+"] | ["+tasks.get(i).getContent()+"] | ["
            +new SimpleDateFormat("dd.MM.yyyy HH:mm").format(tasks.get(i).getDeadline())+"] | ["+done_+"]");
        }
    }

    public static void done(){
        listToDo();
        System.out.print("ToDo-Nr. eingeben zum Abhaken:");
        int d=Integer.parseInt(System.console().readLine());
        if (tasks.get(d).getDone()) {
            tasks.get(d).setDone(false);
        } else {
            tasks.get(d).setDone(true);
        }

        
    }

    public static void delTask(){
        listToDo();
        System.out.print("ToDo-Nr. eingeben zum löschen:");
        tasks.remove(Integer.parseInt(System.console().readLine()));
    }

    public static void sortByDeadline(){
        Collections.sort(tasks, new SortToDoByDate());
        System.out.println("Sortiert...");
    }

}
