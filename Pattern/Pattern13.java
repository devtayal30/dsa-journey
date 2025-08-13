public class Pattern13 {
    public static void main(String[] args) {
        P13(5);
    }

    static void P13(int n){
        for (int row = 0 ; row <= n-1; row++){
            int spaces = n - row ;
            for(int s = 0 ; s < spaces ; s++){
                System.out.print(" ");
            }
            for(int col=0; col < 2*row + 1 ; col++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
