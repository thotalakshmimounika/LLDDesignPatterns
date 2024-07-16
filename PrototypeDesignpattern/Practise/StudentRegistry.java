package PrototypeDesignpattern.Practise;

import java.util.HashMap;
import java.util.Map;
//here Registry is used to create the objects of different attribute values , i.e - Same attributes values are changing
public class StudentRegistry {
    private Map<String, Student> resg = new HashMap<>();
    public void register(String key, Student s){
        resg.put(key,s);
    }
    public Student get(String key){
        return resg.get(key).copy(); // directly creating returing the stored object's copy.
    }
}
