import java.util.ArrayList;

public class AScii {
    public static void main(String[] args) {
        //subAscii("", "abc");
        System.out.println(sub2("", "abc"));
    }

    // How to find ASCII value
    // char ch = 'a';
    // sout(ch + 0);
    // o/p 97

    static void subAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subAscii(p+ch, up.substring(1));
        subAscii(p, up.substring(1));
        subAscii(p + (ch+0), up.substring(1));
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
        ArrayList<String> last = sub2(p + (ch+0), up.substring(1));

        left.addAll(right);
        left.addAll(last);
        return left;
    }
}
