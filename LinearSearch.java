public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,46,7,8};
        int target = 460;

        int ans = LinearSearch(arr, target);
        System.out.println(ans);
    }

    static int LinearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int index=0; index < arr.length ; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
