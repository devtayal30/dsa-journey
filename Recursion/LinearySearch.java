
import java.util.ArrayList;

public class LinearySearch {
    public static void main(String[] args) {
        int[] arr = {3,5,2,6,6,7,8};
        int target = 6;
        System.out.println(findIndex(arr, target, 0));
        // findAllIndex(arr, target, 0);
        // System.out.println(list);

        ArrayList<Integer> ans = findAllIndexs(arr, target, 0, new ArrayList<>());
        System.out.println(ans);
    }

    static boolean find(int[] arr,int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }


     static int findIndex(int[] arr,int target, int index){
        if(index == arr.length){
            return -1;
        }
       if(arr[index] == target){
        return index;
       } else{
        return findIndex(arr, target, index + 1);
       }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr,int target, int index){
        if(index == arr.length){
            return ;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllIndexs(int[] arr,int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndexs(arr, target, index + 1, list);
    }
}
