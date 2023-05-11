package Design_Pattern.PrototypeRegistery.sol3;

import Design_Pattern.Builder.Student;

import java.util.HashMap;

public class registryStudent {
    private HashMap<String, student> map= new HashMap<>();
    public void addStudent(String name , student STUDENT){
        map.put(name,STUDENT);
    }
    public student getStudent( String name){
        return map.get(name);
    }
}
