public class Pattern10 {
    public static void main(String[] args) {
        P10(6);
    }

    static void P10(int n){
        for(int row = 0; row < 2*n-1 ; row++){
            int colofrows = row >= n ? 2 * n - row -1 : row + 1;

        for(int col = 1 ; col <= colofrows ; col++){
            System.out.print("* ");
        }
       
        int spaces = 2 *(n - colofrows);
        for(int space = 0; space < spaces; space++){
            System.out.print("  ");
        }

        for(int col = 1 ; col <= colofrows ; col++){
            System.out.print("* ");
        }
       
        System.out.println(" ");
        }
        
    }
}






