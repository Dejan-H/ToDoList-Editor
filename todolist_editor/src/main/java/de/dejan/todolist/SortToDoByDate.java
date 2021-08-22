package de.dejan.todolist;

import java.util.*;

public class SortToDoByDate implements Comparator<ToDo>{

    @Override
    public int compare(ToDo t1, ToDo t2) {
        // https://stackoverflow.com/questions/5927109/sort-objects-in-arraylist-by-date
        return t1.getDeadline().compareTo(t2.getDeadline());
    }
    
}
