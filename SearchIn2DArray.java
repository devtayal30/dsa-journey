public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 7, 1},
                {11, 45, 65, 3},
                {4, 73, 2, 63},
                {2, 900}
        };
        // int target = 45;
        // int[] ans = search(arr, target);
        // System.out.println(Arrays.toString(ans));

        int value = max(arr);
        System.out.println(value);
    }

    static int[] search(int[][] arr, int target){
        for(int row=0; row < arr.length; row++){
            for (int col=0; col < arr[row].length; col++){
                if (arr[row][col] == target){
                   return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int maxi = Integer.MIN_VALUE;
        for(int row=0; row < arr.length; row++){
            for (int col=0; col < arr[row].length; col++){
                if (arr[row][col] > maxi){
                   maxi = arr[row][col];
                }
            }
        }
        return maxi;
    }
}
