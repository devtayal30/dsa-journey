/*
* *
*  *
*  *  *
*  *  *  *
*  *  *  *  *
*  *  *
*  *
*
*/

public class Pattern5 {
    public static void main(String[] args) {
        P5(5);
    }

    static void P5(int n){
        for(int row = 0; row <= 2*n ; row++){
            // for col
            int totalColsinRow = row > n ? 2 * n - row  : row;
            for(int col = 1; col < totalColsinRow ; col++){
                System.out.print("* " + " ");
            }
            System.out.println();
        }
    }
}
