import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class LargeString {
   public static void main(String[] args) {
    // constructor 1
     StringBuffer sb = new StringBuffer();
     System.out.println(sb.capacity());
    
      // constructor 2
     StringBuffer sb2 = new StringBuffer("Dev");

      // constructor 3
     StringBuffer sb3 = new StringBuffer(30);
     System.out.println(sb3.capacity());

     sb.append("WeMakeDevs");
     sb.append("nice");

     //sb.insert(2, "ser");

     sb.replace(1, 5, "tayal");

     sb.delete(1, 5);

     sb.reverse();

     String str = sb.toString();
     System.out.println(str);

     Random random = new Random();
     System.out.println(random.nextFloat());


     String sentence = "Hi  gty dfcr dvcg xef ";
     System.out.println(sentence);

     System.out.println(sentence.replaceAll("\\s", ""));

     String arr = "Kunal dev ninc nknefk";
     String[] names = arr.split(" ");
     System.out.println(Arrays.toString(names));


     DecimalFormat df = new DecimalFormat("0.0000");
     System.out.println(df.format(7.2));
   }
}
