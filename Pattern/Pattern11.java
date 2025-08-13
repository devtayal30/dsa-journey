public class Pattern11 {
    public static void main(String[] args) {
        P11(5); // You can change the value of n
    }

    static void P11(int n){
        for(int row = 0; row < 2 * n - 1; row++){
            int colofrows = row >= n ? 2 * n - row - 1 : row + 1;

            // Print spaces at the beginning
            for(int s = 0; s < n - colofrows; s++){
                System.out.print("  ");
            }

            // Print stars and spaces in between
            for(int col = 1; col <= 2 * colofrows - 1; col++){
                if(col == 1 || col == 2 * colofrows - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}