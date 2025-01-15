package PrototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
//    String , Student
    private Map<String , Student> students;
    StudentRegistry(){
        students = new HashMap<>();
    }

    public void add(String key , Student student){
        students.put(key , student);
    }

    public Student get(String key){
        return students.get(key).copy();
    }

    public void remove(String key){
        students.remove(key);
    }
}
