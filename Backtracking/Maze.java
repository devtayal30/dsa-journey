// COUNTING PATHS
public class Maze {
    public static void main(String[] args) {
      System.out.println(CountPaths(3, 3));
    }

    static int CountPaths(int r, int c){
        if(r==1 || c==1){
            return 1;
        }

        int left = CountPaths(r-1, c);
        int right = CountPaths(r, c-1);

        return left + right;
    }
}
