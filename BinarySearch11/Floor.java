public class Floor {
    public static void main(String[] args) {
         int[] arr = {2,3,4,5,12,34,56};
        int target = 13;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        if(target < arr[0]){
            return -1;
        }
        int s=0;
        int e = arr.length -1;
        while(s <= e){
            //int mid = (s+e) / 2;  // might be possible that (s+e) exceed the range of java
            int mid = s + (e - s) / 2;
            if (target < arr[mid] ){
                e = mid -1;
            } else if (target > arr[mid]){
                s = mid + 1;
            } else {
                return mid;
            }
        }
        return arr[e];
    }
}
