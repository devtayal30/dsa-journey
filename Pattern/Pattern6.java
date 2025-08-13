public class Pattern6 {
    public static void main(String[] args) {
        P6(5);
    }

    static void P6(int n){
        for(int row = 0; row < 2*n ; row++){
            // for col
            int totalColsinRow = row > n ? 2 * n - row  : row;

            int spaces = n - totalColsinRow;
            for(int s=0 ; s<spaces; s++){
                System.out.print(" ");
            }
            for(int col = 0; col < totalColsinRow ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
