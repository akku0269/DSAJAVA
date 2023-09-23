package RatMaze;

public class RatInaMaze3 {
    public static void main(String[] args) {
        int rows = 4, cols = 6;
        int[][] maze  = {{1,0,1,1,1,1},
                         {1,1,1,1,0,1},
                         {0,1,1,1,1,1},
                         {0,0,1,0,1,1}};
        print(0, 0, rows-1, cols-1,"",maze);
    }

    private static void print(int stRow, int stCol, int endRow, int endCol , String s,int[][] maze) {

        if(stRow > endRow || stCol > endCol) return ;
        if(stRow == endRow && stCol == endCol) {
            System.out.println(s);
            return;
        }
        if(maze[stRow][stCol]==0) return;
        // go down
        print(stRow+1,stCol,endRow,endCol,s+"D",maze);
        // go right
        print(stRow,stCol+1,endRow,endCol,s+"R",maze);
    }
}
