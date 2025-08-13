import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1); 
        // this is same as after a few steps : "a" + "1"
        // when int add with string it will convert into Integer that will call toString()

        System.out.println("Dev" + new ArrayList<>());
        System.out.println("Dev" + new Integer(56));

        //System.out.println(new Integer(56) + new ArrayList<>());  --> error
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);

         

    }
}
