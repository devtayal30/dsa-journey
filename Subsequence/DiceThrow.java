
import java.util.ArrayList;

public class DiceThrow {
    public static void main(String[] args) {
        Dice("", 4);
        System.out.println(Dice2("", 4));
        System.out.println(DiceCount("", 4));
    }

    static void Dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i=1; i<=6 && i<= target;i++){
            Dice(p+i, target-i);
        }
    }

    static ArrayList<String> Dice2(String p , int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

         ArrayList<String> ans = new ArrayList<>();
         for(int i=1; i<=6 && i<= target;i++){
            ans.addAll(Dice2(p+i, target-i));
        }
        return ans;
    }

     static int DiceCount(String p, int target){
        if(target == 0){
           return 1;
        }
        
        int count = 0;
        for(int i=1; i<=6 && i<= target;i++){
            count = count + DiceCount(p+i, target-i);
        }
        return count;
    }
}
