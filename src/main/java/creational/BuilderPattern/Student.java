package creational.BuilderPattern;

public class Student {

    private String name;
    private int rollNo;
    private int age;

    private String address;

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.getName();
        this.rollNo = studentBuilder.getRollNo();
        this.age = studentBuilder.getAge();
        this.address = studentBuilder.getAddress();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
