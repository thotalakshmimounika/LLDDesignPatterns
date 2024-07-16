package BuilderDesignPattern.Practise;

public class Client {
    public static void main(String[] args) {
       // Builder b = new Builder(); create builder obj from student class itself
 //      Builder b = Student.getbuilder();
//        b.setName("Mounika");
//        b.setAge(24);
//        b.setGender("Female");
//        b.setPhonenumber("91000000000");
//        b.setRollno(12);
        //Student s = new Student(b);
        Student s = Student.getbuilder()
                .setName("Mounika")
                .setAge(24)
                .setRollno(12)
                .setPhonenumber("91000000000")
                .setGender("Female")
                .build();

    }
}
