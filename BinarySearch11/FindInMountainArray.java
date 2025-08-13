public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(arr, target);
        System.out.println(ans);
    }
  public static int search (int[] arr , int target){
    int peakindex = peak(arr);
    int first = oabs(arr, target, 0, peakindex);
    if(first != -1){
        return first;
    } 
    return oabs(arr, target, peakindex+1, arr.length -1);
  }

    public static int peak(int[] arr){
        int s = 0;
        int e = arr.length - 1;

        while(s < e){
            int mid = s + (e-s)/2;
            if(arr[mid] > arr[mid + 1]){
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }

    static int oabs(int[] arr, int target,int s , int e){
        

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
