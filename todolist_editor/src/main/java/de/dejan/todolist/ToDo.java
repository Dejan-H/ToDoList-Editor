package de.dejan.todolist;

import java.util.*;

public class ToDo{
    
    private int theID;
    private String theContent;
    private boolean theDone;
    
    // https://docs.oracle.com/javase/8/docs/api/java/util/Date.html
    // https://stackoverflow.com/questions/5927109/sort-objects-in-arraylist-by-date
    private Date theDeadline;


    public ToDo(int id, String content, boolean done, Date deadline){
        theID=id;
        theContent=content;
        theDone=done;
        theDeadline=deadline;
    }

    public ToDo(int id, String content, boolean done){
        theID=id;
        theContent=content;
        theDone=done;
    }

    //get-& set-methods
    public void setID(int id){
        theID=id;
    }

    public int getID(){
        return theID;
    }

    public void setContent(String content){
        theContent=content;
    }

    public String getContent(){
        return theContent;
    }

    public void setDone(boolean done){
        theDone=done;
    }

    public boolean getDone(){
        return theDone;
    }

    public void setDeadline(Date d){
        theDeadline=d;
    }

    public Date getDeadline(){
        return theDeadline;
    }

}
