package creational.BuilderPattern;

public class StudentBuilder {

    private String name;
    private int rollNo;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
    public Student build(){
        return new Student(this);
    }
}
