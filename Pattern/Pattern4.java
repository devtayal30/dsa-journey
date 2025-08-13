public class Pattern4 {
    public static void main(String[] args) {
        P4(5);
    }

    static void P4(int n){
        for(int row = 1; row <= n ; row++){
            // for col
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
