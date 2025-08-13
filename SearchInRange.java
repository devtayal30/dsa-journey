public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {2,3,46,7,8,23,34,56,343,67,32};
        int target = 34;

        int ans = LinearSearch(arr, target,3,8);
        System.out.println(ans);
    }

    static int LinearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int index= start; index <= end; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
