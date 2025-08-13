
import java.util.ArrayList;

public class PrintPath {
    public static void main(String[] args) {
        Print("", 3, 3);
        System.out.println(Print2("",3, 3));
    }

    static void Print(String p,int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            Print( p+'D', r-1, c);
        }
        if(c>1){
            Print(p+'R', r, c-1);
        }
    }

    static ArrayList<String> Print2(String p, int r ,int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r>1){
        list.addAll(Print2( p+'D', r-1, c));
        }
        if(c>1){
        list.addAll(Print2( p+'R', r, c-1));
        }       
        return list;
    }
}
