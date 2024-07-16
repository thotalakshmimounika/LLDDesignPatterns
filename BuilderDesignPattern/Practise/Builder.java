package BuilderDesignPattern.Practise;

public class Builder {
    private String name;
    private int age;
    private int rollno;
    private String gender;
    private String phonenumber;

    public String getName() {
        return name;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public int getRollno() {
        return rollno;
    }

    public Builder setRollno(int rollno) {
        this.rollno = rollno;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Builder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public Builder setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
        return this;
    }

    public Student build(){
        if(this.getAge()>25){
            throw new IllegalArgumentException("Age cannot be greater than 25");
        }

        return new Student(this);
    }
}
