
import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
        //sub("", "abc");
        System.out.println(sub2("", "abc"));
    }

    static void sub(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        sub(p+ch, up.substring(1));
        sub(p, up.substring(1));
    }


    static ArrayList<String> sub2(String p, String up){
        if(up.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = sub2(p+ch, up.substring(1));
        ArrayList<String> right = sub2(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
