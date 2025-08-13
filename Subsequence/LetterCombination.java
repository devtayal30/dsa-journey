import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
   public static void main(String[] args) {
   System.out.println( pad2("", "23"));
   }

static void pad(String p, String up){
      if(up.isEmpty()){
            System.out.println(p);
            return;
        }
     int digit = up.charAt(0) -  '0'; 

    for(int i = (digit-1)*3; i < digit*3; i++){
        char ch = (char) ('a' + i);
        pad(p+ch , up.substring(1));
    }
  }

static List<String> pad2(String p, String up){
    if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

    int digit = up.charAt(0) -  '0'; 

    List<String> list = new ArrayList<>();

    for(int i = (digit-1)*3; i < digit*3; i++){
        char ch = (char) ('a' + i);
        list.addAll(pad2(p+ch , up.substring(1)));
    }
    return list;
}

static int padCount(String p, String up){
      if(up.isEmpty()){
            System.out.println(p);
             return 1;
        }
         int count = 0;
     int digit = up.charAt(0) -  '0'; 

    for(int i = (digit-1)*3; i < digit*3; i++){
        char ch = (char) ('a' + i);
        count = count + padCount(p+ch , up.substring(1));
    }
    return count;
  }
}
