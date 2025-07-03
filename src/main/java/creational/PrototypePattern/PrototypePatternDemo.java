package creational.PrototypePattern;

public class PrototypePatternDemo {

    public static void main(String[] args) {
        Student student = new Student("Ram", 24, 36);

        Student cloneObj = (Student) student.clone();
    }
}
