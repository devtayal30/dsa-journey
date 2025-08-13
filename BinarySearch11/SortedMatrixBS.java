
import java.util.Arrays;

public class SortedMatrixBS {
    public static void main(String[] args) {
      int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
      };

      System.out.println(Arrays.toString(search(arr, 9)));
    }

    static int[] binarySearch(int[][] matrix, int row, int cs, int ce, int target) {
        while (cs <= ce) {
            int mid = cs + (ce - cs) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }
            if (matrix[row][mid] < target) {
                cs = mid + 1;
            } else {
                ce = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious , matrix may be empty

        if (rows == 1){
            return binarySearch(matrix, 0, 0, cols-1 , target);
        }

        // run the loop till 2 rows remaining
        int rs = 0;
        int re = rows -1;
        int cMId = cols / 2;
        while (rs < (re - 1)) {  // when true it will have more than 2 row
            int mid = rs + (re-rs) / 2;
            if(matrix[mid][cMId] == target){
                return new int[]{mid,cMId};
            }
            if (matrix[mid][cMId] < target){
                rs = mid;
            } else{
                re = mid;
            }
        } 

        // now we have two rows left
        // check whether the targer is in col of 2 rows
        if (matrix[rs][cMId] == target){
            return new int[]{rs, cMId};
        }
         if (matrix[rs + 1][cMId] == target){
            return new int[]{rs + 1, cMId};
        }

        // search in 1 half
        if(target <= matrix[rs][cMId -1]){
            return binarySearch(matrix, rs, 0, cMId-1, target);
        }
        
        // search in 2 half
        if(target >= matrix[rs][cMId + 1] && target <= matrix[rs][cols-1]){
            return binarySearch(matrix, rs, cMId + 1, cols -1, target);
        }
        
        // search in 3 half
        if(target <= matrix[rs + 1][cMId -1]){
            return binarySearch(matrix, rs + 1, 0, cMId-1, target);
        } else {
            return binarySearch(matrix, rs + 1, cMId + 1, cols - 1, target);
        }
    }
}
