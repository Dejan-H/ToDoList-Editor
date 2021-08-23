package de.dejan.todolist.io;

import de.dejan.todolist.*;
//import jdk.internal.org.jline.utils.InputStreamReader;

import java.io.*;
import java.lang.reflect.Type;
import java.util.*;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

public class ToDoListFromToJSON {
    

    public static void saveToDoList(ArrayList<ToDo> tasks, String listname){
        Gson gson=new GsonBuilder().setPrettyPrinting().create();

        
        try {
            FileWriter fw=new FileWriter(listname);
            gson.toJson(tasks, fw);
            fw.close();
        } catch (JsonIOException e) {
            //e.printStackTrace();
        } catch (IOException e) {
            //e.printStackTrace();
        }

    }
    
    public static ArrayList<ToDo> loadToDoList(String listname){
        ArrayList<ToDo> tasks=new ArrayList<ToDo>();
        Gson gson=new Gson();

        try {
            BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream(listname)));
            Type list=new TypeToken<ArrayList<ToDo>>(){}.getType();

            tasks=gson.fromJson(br, list);
            br.close();

        } catch (Exception e) {
            
        }
        

        return tasks;
    }

}
