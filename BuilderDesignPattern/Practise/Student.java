package BuilderDesignPattern.Practise;

public class Student {
    private String name;
    private int age;
    private int rollno;
    private String gender;
    private String phonenumber;
    public Student(Builder builder){
        if(builder.getAge()>25){
            throw new IllegalArgumentException("Age cannot be greater than 25");
        }
        this.name= builder.getName();
        this.age= builder.getAge();
        this.rollno= builder.getRollno();
        this.gender= builder.getGender();
        this.phonenumber= builder.getPhonenumber();
    }
    public static Builder getbuilder(){
        return new Builder();
    }
}
