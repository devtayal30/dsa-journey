public class Triangle1 {
    public static void main(String[] args) {
        pattertn2(4, 0);
    }

    static  void pattertn(int r, int c){
        if(r == 0){
            return;
        }
        if (c<r){
            System.out.print("*");
            pattertn(r, c+1);
        } else {
            System.out.println();
            pattertn(r-1, 0);
        }

    }

    static  void pattertn2(int r, int c){
        if(r == 0){
            return;
        }
        if (c<r){
            
            pattertn2(r, c+1);
            System.out.print("*");
        } else {
            
            pattertn2(r-1, 0);
            System.out.println();
        }

    }
}
