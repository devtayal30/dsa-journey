public class RotationCountBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,0,1,2};
        System.out.println(findRotation(arr));
    }

    static int findRotation(int[] arr){
        int pivot = findPivot(arr);
        return pivot + 1;
    }

        static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


    static int findPivotDuplicate(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            // if ele at mid , s, e are equal then just skip duplicate
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicates
                // NOte: what if these elements at start and end were the pivot?
                // check if s pivot

                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                // check for end
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            // left is sort , so pivot should be right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
