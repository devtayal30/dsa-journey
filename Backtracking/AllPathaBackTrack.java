public class AllPathaBackTrack {
    public static void main(String[] args) {
        boolean[][] board = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };

        Print("", board, 0, 0);       
    }
    
    static void Print(String p,boolean[][] maze,int r, int c){
        if(r== maze.length -1 && c== maze[0].length-1){
            System.out.println(p);
            return;
        }
       if(!maze[r][c]){
        return;
       }
       // i cosider it in my maze

       maze[r][c] = false;
        if(r < maze.length-1){
            Print( p+'D',maze, r+1, c);
        }
        if(c < maze[0].length-1){
            Print(p+'R', maze ,r, c+1);
        }
        if(r>0){
            Print(p+'U', maze ,r-1, c);
        }
        if(c >0){
            Print(p+'R', maze ,r, c-1);
        }

        // fun over
        // so before fun removed, also remove changes that were made by fun
        maze[r][c] = true; // bactrack
    }
}
