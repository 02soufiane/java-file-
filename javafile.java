import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class st {
    public static void main(String[] args) throws IOException {
        make("new.txt","Java file.",true);
        make("new.txt","Second line.",true);
    }

    public static void make(String name , String message , boolean add) throws IOException {
        File file= new File(name);
        FileWriter fw = new FileWriter(file,add);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(message);
        pw.close();
    }
}
