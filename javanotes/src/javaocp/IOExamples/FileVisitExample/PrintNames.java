package javaocp.IOExamples.FileVisitExample;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

//printing all files in directory
public class PrintNames extends SimpleFileVisitor<Path> {
    private Path file=FileSystems.getDefault().getPath("files");


    public static void main(String[] args) {
        //        System.out.println("------Walking Tree for files---------");
//        try{
//            Files.walkFileTree(file,this);
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println(file.toAbsolutePath());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println(dir.toAbsolutePath());
        return FileVisitResult.CONTINUE;
    }


    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("error accessing file: "+file.toAbsolutePath()+" "+exc.getMessage());
        return FileVisitResult.CONTINUE;
    }
}
