//WHEN WE DONT ARRAY IS SORT IN ASC OR DESC ORDER . IN THIS WE FIND THE SORTING ORDER OF THE ARRAY   

public class OrgerAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {18,12,3,4,5,-12,-34,-56};
        int target = 4;
        int ans = oabs(arr, target);
        System.out.println(ans);
    }

    static int oabs(int[] arr, int target){
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
                return mid;
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
        return -1;
    }
}
