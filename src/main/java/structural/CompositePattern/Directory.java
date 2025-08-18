package structural.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    private String directoryName;
    private List<FileSystem> directoryFiles = new ArrayList<>();

    public Directory(String directoryName) {
        this.directoryName = directoryName;
    }

    public void mkdir(String directoryName){
        directoryFiles.add(new Directory(directoryName));
    }

    public void touch(String filename){
        directoryFiles.add(new File(filename));
    }

    @Override
    public void ls() {
        System.out.println(directoryName);
        for(FileSystem fileOrDirectory : directoryFiles){
            fileOrDirectory.ls();
        }
    }
}
