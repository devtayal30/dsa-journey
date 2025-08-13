public class Max {
    public static void main(String[] args) {
        int[] arr ={3,4,55,55,666,7};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maxi = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxi){
                maxi = arr[i];
            }
        }
        return maxi;
    }  
}
