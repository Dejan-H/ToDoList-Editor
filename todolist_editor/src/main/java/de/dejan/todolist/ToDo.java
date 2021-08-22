package de.dejan.todolist;

public class ToDo {
    
    private int theID;
    private String theContent;
    private boolean theDone;
    String theDeadline;

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


}
