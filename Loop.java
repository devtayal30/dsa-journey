
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        
        // print no from 1 to 5
        // for loop

    //   for (int num = 1; num <= 5; num++) {
    //       System.out.println(num);
    //   }

      // print no from 1 to n
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      
      for (int i = 0; i <= n; i++) {
        System.out.println(i + " ");
      }

    }
}
