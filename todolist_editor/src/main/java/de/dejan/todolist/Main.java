package de.dejan.todolist;


public class Main{
    public static void main( String[] args ){
        String[] tasks=new String[10];

        System.out.println("ToDo-Liste:");

        System.out.println("\n10 Aufgaben hinzufügen:");

        for(int i=0; i<10; i++){

            tasks[i]=System.console().readLine();

        }

        System.out.println("\nListe:");

        for(int i=0; i<10; i++){

            System.out.println(tasks[i]);

        }


    }
}
