mport java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class st {
    public static void main(String[] args) throws IOException {
        make("new.txt","Java file.");
    }

    public static void make(String name , String message) throws IOException {
        File file= new File(name);
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.print(message);
        pw.close();
    }
}
