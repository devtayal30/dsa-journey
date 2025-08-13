import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        int ans = Sum();
        System.out.println(ans);

        Sum2();

        String message = greet();
        System.out.println(message);
    }
    static int Sum(){
      Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
      int num2 = in.nextInt();

      int sum = num1 + num2;

      return sum;
    }

    static void Sum2(){
      Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
      int num2 = in.nextInt();

      int sum = num1 + num2;

      System.out.println(sum);
    }

    static String greet(){
        String greeting = "How are you";
        return greeting;
    }
}
