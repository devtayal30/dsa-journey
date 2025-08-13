public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,46,-7,8,23,34,56,343,67,32};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int mini = Integer.MAX_VALUE;
        for(int i=0 ; i <arr.length; i++){
            if(arr[i] < mini){
                mini = arr[i];
            }
        }
        return mini;
    }
}
