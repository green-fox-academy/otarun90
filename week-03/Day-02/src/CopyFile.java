import java.io.File;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CopyFile {
        public static boolean copyFiles() {
            try {
                Scanner s = new Scanner(new File("my-file.txt"));
                ArrayList<String> list = new ArrayList<String>();
                while (s.hasNextLine()) {
                    list.add(s.nextLine());
                }
                System.out.println(list);
                s.close();
                Path copyPath = Paths.get("my-file2.txt");
                Files.write(copyPath, list);
            } catch (Exception e) {
               return false;
            }
            return true;}
    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful
        System.out.println(copyFiles());
    }
}
