package PrototypeDesignpattern.Practise;

public class client {
    public static void fillRegistry(StudentRegistry studentRegistry){
        Student apr23Student = new Student();
        apr23Student.name = "Apr23Temp";
        studentRegistry.register("Apr23Student", apr23Student);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);
        Student s = new Student();
        s.name ="Mounika";
        s.age = 24;
        s.id =2;
        Student s1 = s.copy();
        Student s2 = studentRegistry.get("Apr23Student");
    }
}
