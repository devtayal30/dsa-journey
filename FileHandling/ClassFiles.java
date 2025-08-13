import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClassFiles {
    public static void main(String[] args) {
        //create
        try {
            File fo = new File("new-file.txt");
            fo.createNewFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // wrire in the file
        try {
            FileWriter fw = new FileWriter("new-file.txt");
            fw.write("Jai Shree Shyam");
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // read
        try(BufferedReader br = new BufferedReader(new FileReader("new-file.txt"))){
            while(br.ready()){
                System.err.println(br.readLine());
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        // delete
        try {
            File fo = new File("random.txt");
            fo.createNewFile();
            if(fo.delete()){
                System.out.println(fo.getName());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
