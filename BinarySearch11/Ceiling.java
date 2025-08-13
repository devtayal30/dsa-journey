// CEILING - GREATEST NO EUAL TO TARGET

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,16};
        int target = 14;
        int ans = oabs(arr, target);
        System.out.println(ans);
    }

        static int oabs(int[] arr, int target){
        if(target > arr[arr.length - 1]){
            return -1;
        }
        int s=0;
        int e = arr.length -1;

        // find whether the arr sort in asc oe descc
        // boolean isAsc;
        // if (arr[s] < arr[e]){
        //     isAsc = true;
        // } else {
        //     isAsc = false;
        // }

        boolean isAsc = arr[s] < arr[e];

        while(s <= e){
            //int mid = (s+e) / 2;  // might be possible that (s+e) exceed the range of java
            int mid = s + (e - s) / 2;
            if(arr[mid] == target){
                return arr[mid];
            }

            if(isAsc){
              if (target < arr[mid] ){
                e = mid -1;
            } else if (target > arr[mid]){
                s = mid + 1;
            }
            } else{
                if (target > arr[mid] ){
                e = mid -1;
            } else if (target < arr[mid]){
                s = mid + 1;
            }
            }
        }
       return arr[s];
    }
}
