package de.dejan.todolist;

public class ToDo {
    
    int theId;
    String theContent;
    private boolean theDone;
    String theDeadline;

    public ToDo(int id, String content, boolean done){
        theId=id;
        theContent=content;
        theDone=done;
    }

    public void setDone(boolean done){
        theDone=done;
    }

    public boolean getDone(){
        return theDone;
    }


}
