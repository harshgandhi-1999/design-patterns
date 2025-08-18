package structural.CompositePattern;

public class CompositePatternDemo {
    public static void main(String[] args) {

        Directory homeDirectory = new Directory("home");

        homeDirectory.ls();

        homeDirectory.touch("abc.txt");
        homeDirectory.touch("script.txt");
        homeDirectory.touch("tasks.txt");

        homeDirectory.ls();

        homeDirectory.mkdir("harsh");
        homeDirectory.ls();
    }
}
