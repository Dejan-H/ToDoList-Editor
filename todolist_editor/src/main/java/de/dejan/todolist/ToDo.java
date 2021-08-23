package de.dejan.todolist;

import java.util.*;

public class ToDo{
    
    private int id;
    private String content;
    private boolean done;
    
    // https://docs.oracle.com/javase/8/docs/api/java/util/Date.html
    // https://stackoverflow.com/questions/5927109/sort-objects-in-arraylist-by-date
    private Date deadline;


    public ToDo(int id, String content, boolean done, Date deadline){
        this.id=id;
        this.content=content;
        this.done=done;
        this.deadline=deadline;
    }

    public ToDo(int id, String content, boolean done){
        this.id=id;
        this.content=content;
        this.done=done;
    }

    //get-& set-methods
    public void setID(int id){
        this.id=id;
    }

    public int getID(){
        return id;
    }

    public void setContent(String content){
        this.content=content;
    }

    public String getContent(){
        return this.content;
    }

    public void setDone(boolean done){
        this.done=done;
    }

    public boolean getDone(){
        return this.done;
    }

    public void setDeadline(Date d){
        this.deadline=d;
    }

    public Date getDeadline(){
        return this.deadline;
    }

}
