public class Pattern2 {
    public static void main(String[] args) {
        P2(4);
    }

    static void P2(int n){
        for(int row = 1; row <= n ; row++){
            // for col
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
