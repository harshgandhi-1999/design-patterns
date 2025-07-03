package creational.BuilderPattern;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        Student student = new StudentBuilder()
                .setName("Harsh")
                .setAge(24)
                .setRollNo(30)
                .setAddress("noida")
                .build();

        System.out.println(student.toString());
    }
}
