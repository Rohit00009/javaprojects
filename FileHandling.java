import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileWriter;

public class FileHandling {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Acer\\Desktop\\javaprojects\\file.txt";
        String textData= """
                hello 
                myself rohit
                im from khandesh
                """;

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textData);
            System.out.println("File has been written!");
        }
        catch (FileNotFoundException e){
            System.out.println("File not found!");
        }
        catch (IOException e) {
            System.out.println("Could not write file");
        }
    }
}
