import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class FileHandlings {
    public static void main(String[] args) {

        // try(InputStreamReader isr = new InputStreamReader(System.in)) {
        //     System.out.print("Enter some letters:");
        //     int letters = isr.read();
        //     while(isr.ready()){
        //         System.out.println((char) letters);
        //         letters = isr.read();
        //     }
        //     isr.close();
        //     System.out.println();
        // } catch (IOException e){
        //     System.out.println(e.getMessage());
        // }


        // try(FileReader fr = new FileReader("note.txt")) {
        //     System.out.print("Enter some letters:");
        //     int letters = fr.read();
        //     while(fr.ready()){
        //         System.out.println((char) letters);
        //         letters = fr.read();
        //     }
        //     fr.close();
        //     System.out.println();
        // } catch (IOException e){
        //     System.out.println(e.getMessage());
        // }
        
        // // byte to char stream and then reading char stream
        // try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        //     System.out.println("You typed: " + br.readLine());
        // } catch (IOException e){
        //     System.out.println(e.getMessage());
        // }
        
        // try(BufferedReader br = new BufferedReader(new FileReader("note.txt"))){
        //     while(br.ready()){
        //         System.err.println(br.readLine());
        //     }
        // } catch (IOException e){
        //     System.out.println(e.getMessage());
        // }
        

        //output
        OutputStream os = System.out;
        //  os.write(😀);  // range is exceeded

        System.out.println();

        // try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
        //     osw.write("Hello World");
        //     osw.write(97);
        //     osw.write(10);
        //     osw.write('A');
        //     osw.write('\n');
        //     char[] arr = "hello world".toCharArray();
        //     osw.write(arr);
        //     //osw.write(😀);
        // } catch (IOException e){
        //     System.out.println(e.getMessage());
        // }

        try(FileWriter fw = new FileWriter("note.txt",true)){
            fw.write(" This is appended");
            
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt"))){
            bw.write("Radhe Radhe");
            
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
