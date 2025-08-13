import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // when we don not know how many inputs we are given
        fun(2,3,4,6,7,89,2,3,4,6,7,8);
        multiple(2, 3, "Dev", "efjrnf","frfrf");
        demo();
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){
      System.out.println(a);
      System.out.println(b);
      System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
