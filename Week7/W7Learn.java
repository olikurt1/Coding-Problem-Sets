import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
public class W7Learn {
    
    public static void main(String[] args)throws IOException{
        /*Object assigned a value which is path to a file or directory which methods can later be used on it for */
        Path path = Path.of("C:/Users/oliku/OneDrive/Documents/Coding-Problem-Sets/Week7/practicalFiles/sourceDirectory/a/a.txt");
        System.out.println("File name: "+path.getFileName());
        /*Returns the Absolute path up to the parent */
        System.out.println("Parent Directory: "+path.getParent());
        System.out.println("Absolute Path: "+ path.toAbsolutePath());
        
        /*Returns boolean true or false depending on file existence*/
        System.out.println("a.txt exists: "+Files.exists(path));
        System.out.println("a.txt size: "+ Files.size(path));
         
       /*  Path path2 = Path.of("Week7/testTesttEST.txt");
        Files.createFile(path2);
        /*Dir Path when the object value is the path of a directory 
        Path dirPath = Path.of("Week7/testTestDir");
        Files.createDirectory(dirPath); */
        
        Path pathToDelete = Path.of("C:/Users/oliku/OneDrive/Documents/Coding-Problem-Sets/Week7/testTestDir");
        System.out.println("testTestDir exists: "+Files.exists(pathToDelete));
        Files.delete(pathToDelete);

    }
}
