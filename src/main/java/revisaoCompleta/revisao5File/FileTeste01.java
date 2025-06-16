package revisaoCompleta.revisao5File;

import java.io.File;
import java.io.IOException;

public class FileTeste01 {
    public static void main(String[] args){
        File file = new File("maria.txt");
        try{
            boolean isCreated = file.createNewFile();
            System.out.println("Created: " + isCreated);
            System.out.println("Path: " + file.getPath());
            System.out.println("Path absolute: " + file.getAbsolutePath());
            System.out.println("Is directory " + file.isDirectory());
            System.out.println("Is file " + file.isFile());
            System.out.println("Is file:" + file.isFile());
            System.out.println("Last modified: " );
            boolean exists = file.exists();
        }catch(IOException exception){
            exception.printStackTrace();
        }
    }
}
