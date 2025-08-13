public class Pattern9 {
    public static void main(String[] args) {
        P9(5);
    }

    static void P9(int n){
        int originalN = n;
        n = 2 * n; 
        for(int row=0; row <= n; row++){
            for(int col = 0; col <= n;col++){
                int index = originalN - Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(index + " ");
            }
            System.out.println(" ");
        }
    }
}
