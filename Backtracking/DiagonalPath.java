import java.util.ArrayList;

public class DiagonalPath {
    public static void main(String[] args) {
        System.out.println(Print2("",3, 3));
        
    }

    static ArrayList<String> Print2(String p, int r ,int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r>1 && c>1){
        list.addAll(Print2( p+'D', r-1, c-1));
        }
        if(r>1){
        list.addAll(Print2( p+'V', r-1, c));
        }
        if(c>1){
        list.addAll(Print2( p+'H', r, c-1));
        }       
        return list;
    }
}
