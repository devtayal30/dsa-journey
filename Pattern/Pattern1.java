public class Pattern1 {
    public static void main(String[] args) {
         P1(4);
         
    }

    static void P1(int n){
        for(int row = 1; row <= n ; row++){
            // for col
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
