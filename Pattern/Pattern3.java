public class Pattern3 {
    public static void main(String[] args) {
        P3(4);
    }

    static void P3(int n){
        for(int row = 1; row <= n ; row++){
            // for col
            for(int col = 1; col <= n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
