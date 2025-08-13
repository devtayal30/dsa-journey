public class InfiniteBinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,5,6,7,12,34,56,67,87,96,99,101,123,145,234};
        int target = 34;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
             int temp = end + 1;  // new start
             // double the window size
             end = end + (end - start + 1) * 2;
             start = temp;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target,int s, int e){
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
        return -1;
    }
}
