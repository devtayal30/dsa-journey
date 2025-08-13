
import java.util.ArrayList;

public class Pemutations {
    public static void main(String[] args) {
        //perm("", "abc");
        //System.out.println(perm2("", "abc"));
        int ans = permCount("", "abc");
        System.out.println(ans);
    }

    static void perm(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            perm(f + ch + s, up.substring(1));
        }
    }


    static ArrayList<String> perm2(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(perm2(f + ch + s, up.substring(1)));
        }
        return ans;
    }


    static int permCount(String p , String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);

        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count + permCount(f + ch + s, up.substring(1));
        }
        return count;
    }

}
